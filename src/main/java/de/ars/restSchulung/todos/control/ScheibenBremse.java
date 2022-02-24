package de.ars.restSchulung.todos.control;

import org.springframework.stereotype.Component;

@Component(value = "Scheibenbremse")
public class ScheibenBremse implements Bremse {
    @Override
    public void bremsen() {
        System.out.println("Scheibenbremse bremst");
    }
}
