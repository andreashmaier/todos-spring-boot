package de.ars.restSchulung.todos.boundary;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @GetMapping(value = "/hello", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String sayHello() {
        return "<h1>Hello  World</h1>";
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
