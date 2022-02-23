package de.ars.restSchulung.todos.boundary;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Todo {

    @Id
    private String uuid;

    @ValidBezeichung
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
