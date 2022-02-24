package de.ars.restSchulung.todos.control;

import org.springframework.stereotype.Component;

@Component(value = "Seilzugbremse")
public class SeilzugBremse implements Bremse {
    @Override
    public void bremsen() {
        System.out.println("Seilzugbremse bremst");
    }
}
