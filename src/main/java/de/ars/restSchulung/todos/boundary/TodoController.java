package de.ars.restSchulung.todos.boundary;

import de.ars.restSchulung.todos.control.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

@Controller
public class TodoController {

    @Autowired
    private TodoService todoService;

    @Autowired
    private Validator validator;

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

    @GetMapping(value = "/erstelle")
    public String erstelle() {
        return "erstellen";
    }

    @PostMapping(value = "erstelleTodo")
    public String erstelleTodo(@RequestParam String bezeichnung, Integer prio, Model model) {
        Todo todo = new Todo(bezeichnung, prio);
        Set<ConstraintViolation<Todo>> violations = validator.validate(todo);
        String message = "";
        for (ConstraintViolation<Todo> violation : violations) {
            System.out.println(violations);
            message += violation.getMessage() + " ";
        }
        if (!violations.isEmpty()) {
            model.addAttribute("message", message);
            return "erstellen";
        } else {
            todoService.einfuegen(todo);
            return "redirect:/todos";
        }
    }

}
