package de.ars.restSchulung.todos.control;

import de.ars.restSchulung.todos.boundary.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class TodoService {

    //    @Autowired
//    TodoRepository repository;
    List<Todo> todos = new ArrayList<>();

    public TodoService() {
    }

    public Collection<Todo> getTodos() {
//        return repository.findAll();
        return todos;
    }

    public void loechen(String id) {
//        if (repository.existsById(id)) {
//            repository.deleteById(id);
//        }
        todos.removeIf(todo -> todo.getUuid().equals(id));
    }

    public void einfuegen(Todo todo) {
//        repository.save(todo);
        todos.add(todo);
    }
}
