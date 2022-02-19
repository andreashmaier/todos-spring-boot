package de.ars.restSchulung.todos.control;

import de.ars.restSchulung.todos.boundary.Todo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TodoService {


    private List<Todo> todos = new ArrayList<>();

    public TodoService() {
        todos.add(new Todo("Spring-Boot lernen", 5));
        todos.add(new Todo("REST lernen", 3));
        todos.add(new Todo("Testen lernen", 10));
    }

    public Collection<Todo> getTodos() {
        return todos;
    }


}
