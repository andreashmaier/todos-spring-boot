package de.ars.restSchulung.todos.boundary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {
    @GetMapping(value = "/todos")
    @ResponseBody
    public Todo findAll() {
        return new Todo("Spring Boot lernen", 5);
    }
}
