package de.ars.restSchulung.todos.boundary.rest;

import de.ars.restSchulung.todos.boundary.NotFoundException;
import de.ars.restSchulung.todos.boundary.Todo;
import de.ars.restSchulung.todos.control.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.ValidationException;
import java.util.Collection;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/todos")
public class TodoRestController {

    private TodoService todoService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Todo> getTodos() {
        return todoService.getTodos();
    }

    @GetMapping("/{uuid}")
    public ResponseEntity<Todo> findById(@PathVariable String uuid) {
        Todo todo = todoService.findById(uuid);
        if (todo == null) {
            throw new NotFoundException("Todo mit uuid " + uuid + " nicht vorhanden!");
        }
        return ResponseEntity.ok(todo);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Todo> insert(@RequestBody Todo todo) {
        System.out.println(todo);
//        RestTemplate restTemplate = new RestTemplate();
//        Quota quota = restTemplate.getForObject("http://localhost:8081/api/v1/quotas/Andreas", Quota.class);
//        System.out.println(quota);
        todoService.einfuegen(todo);
        return ResponseEntity.ok(todo);
    }

    @DeleteMapping("{uuid}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable String uuid) {
        todoService.loechen(uuid);
    }

    @PutMapping(value = "/{uuid}", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable String uuid, @RequestBody Todo todo) {
        if (!uuid.equals(todo.getUuid())) {
            throw new ValidationException();
        }
        if (!todoService.update(todo)) {
            throw new NotFoundException();
        }
    }
}
