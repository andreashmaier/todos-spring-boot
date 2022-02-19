package de.ars.restSchulung.todos.boundary;

public class Todo {

    private String name;
    private int prioritaet;

    public Todo() {
    }

    public Todo(String name) {
        this.name = name;
    }

    public Todo(String name, int prioritaet) {
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
}
