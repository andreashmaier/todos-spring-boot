package de.ars.restSchulung.todos.control;

import de.ars.restSchulung.todos.boundary.Todo;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
@Validated
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

    public void toWas(@Valid Todo todo) {
        System.out.println(todo.getUuid());

    }
}
