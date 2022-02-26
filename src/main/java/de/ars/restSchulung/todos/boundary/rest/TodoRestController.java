package de.ars.restSchulung.todos.boundary.rest;

import de.ars.restSchulung.todos.boundary.Todo;
import de.ars.restSchulung.todos.control.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/todos" )
public class TodoRestController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/{uuid}")
    public ResponseEntity<Todo> findById(@PathVariable String uuid) {
        Todo todo = todoService.findById(uuid);
        if (todo == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(todo);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Todo> insert(@RequestBody Todo todo) {
        System.out.println(todo);
        todoService.einfuegen(todo);
        return ResponseEntity.ok(todo);
    }
}
