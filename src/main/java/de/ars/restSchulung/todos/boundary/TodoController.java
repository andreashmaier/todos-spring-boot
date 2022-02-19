package de.ars.restSchulung.todos.boundary;

import de.ars.restSchulung.todos.control.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

    private TodoService todoService = new TodoService();

    @GetMapping(value = "/todos")
    public String findAll(Model model) {
        model.addAttribute("todos", todoService.getTodos());
        return "ausgabe";
    }
}
