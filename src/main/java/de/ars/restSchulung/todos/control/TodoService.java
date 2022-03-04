package de.ars.restSchulung.todos.control;

import de.ars.restSchulung.todos.boundary.Todo;
import de.ars.restSchulung.todos.entity.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class TodoService {

    TodoRepository repository;

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
