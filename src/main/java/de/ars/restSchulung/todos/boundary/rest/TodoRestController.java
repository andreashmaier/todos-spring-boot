package de.ars.restSchulung.todos.boundary.rest;

import de.ars.restSchulung.todos.boundary.NotFoundException;
import de.ars.restSchulung.todos.boundary.Todo;
import de.ars.restSchulung.todos.control.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        todoService.einfuegen(todo);
        return ResponseEntity.ok(todo);
    }

    @DeleteMapping("{uuid}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable String uuid) {
        todoService.loechen(uuid);
    }
}
