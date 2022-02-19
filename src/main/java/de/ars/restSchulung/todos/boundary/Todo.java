package de.ars.restSchulung.todos.boundary;

import java.util.UUID;

public class Todo {

    private String uuid;
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
