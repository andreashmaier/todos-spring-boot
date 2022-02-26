package de.ars.restSchulung.todos.control;

import de.ars.restSchulung.todos.boundary.Todo;
import de.ars.restSchulung.todos.entity.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    TodoRepository repository;

    public TodoService() {
    }

    public Todo findById(String uuid) {
        return repository.findById(uuid).orElse(null);
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
