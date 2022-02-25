package de.ars.restSchulung.todos.boundary;

import de.ars.restSchulung.todos.control.Bremse;
import de.ars.restSchulung.todos.control.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorldController {

    @Autowired
    @Qualifier(value = "Scheibenbremse")
    private Bremse bremse1;

    @Autowired
    @Qualifier(value = "Seilzugbremse")
    private Bremse bremse2;

    @Autowired
    private TodoService todoService;

    @GetMapping(value = "/hello", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String sayHello(@RequestHeader("accept-language") String lang) {
        System.out.println(lang);
        bremse1.bremsen();
        bremse2.bremsen();
        Todo todo = new Todo("es");
        todoService.toWas(todo);
        return "<h1>Hello World</h1>";
    }

    @GetMapping(value = "/hallo", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String sagHallo(@RequestParam(defaultValue = "") String name) {
        return "Hallo " + name;
    }

    @PostMapping(value = "/login")
    @ResponseBody
    public String test(@RequestParam String name) {
        return "Hallo " + name;
    }

}
