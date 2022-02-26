package de.ars.restSchulung.todos.boundary;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Todo {

    @Id
    private String uuid;

    @ValidBezeichung
    private String bezeichnung;
    @ValidPrio
    private Integer prioritaet;

    public Todo() {
        uuid = UUID.randomUUID().toString();
    }

    public Todo(String bezeichnung) {
        this();
        this.bezeichnung = bezeichnung;
    }

    public Todo(String bezeichnunug, int prioritaet) {
        this();
        this.bezeichnung = bezeichnunug;
        this.prioritaet = prioritaet;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
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
