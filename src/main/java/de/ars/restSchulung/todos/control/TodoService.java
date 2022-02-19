package de.ars.restSchulung.todos.control;

import de.ars.restSchulung.todos.boundary.Todo;
import de.ars.restSchulung.todos.entity.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TodoService {

    @Autowired
    TodoRepository repository;

    public TodoService() {
    }

    public Collection<Todo> getTodos() {
        return repository.findAll();
    }

    public void loechen(String id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        }
    }

    public void einfuegen(Todo todo) {
        repository.save(todo);
    }
}
