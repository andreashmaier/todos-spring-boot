package de.ars.restSchulung.todos.boundary;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.UUID;

@Entity
public class Todo {

    @Id
    private String uuid;

    @Size(min = 3, max = 20, message = "Bezeichnung muss mindestesn 3 Zeichen haben")
    @Pattern(regexp = "[A-Z].*")
    private String name;
    private int prioritaet;

    public Todo() {
        uuid = UUID.randomUUID().toString();
    }

    public Todo(String name) {
        this();
        this.name = name;
    }

    public Todo(String name, int prioritaet) {
        this();
        this.name = name;
        this.prioritaet = prioritaet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrioritaet() {
        return prioritaet;
    }

    public void setPrioritaet(int prioritaet) {
        this.prioritaet = prioritaet;
    }

    public String getUuid() {
        return uuid;
    }
}
