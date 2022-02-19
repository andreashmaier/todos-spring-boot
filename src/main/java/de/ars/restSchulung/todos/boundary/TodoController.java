package de.ars.restSchulung.todos.boundary;

import de.ars.restSchulung.todos.control.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping(value = "/todos")
    public String findAll(Model model) {
        model.addAttribute("todos", todoService.getTodos());
        return "ausgabe";
    }

    @GetMapping(value = "/loeschen")
    public String loeschen(@RequestParam String id, Model model) {
        todoService.loechen(id);
        return "redirect:/todos";
    }
}
