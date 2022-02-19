package de.ars.restSchulung.todos.boundary;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {
    @GetMapping(value = "/todos")
    public String findAll(Model model) {
        Todo todo = new Todo("Spring Boot lernen", 5);
        model.addAttribute("todo", todo);
        return "ausgabe";
    }
}
