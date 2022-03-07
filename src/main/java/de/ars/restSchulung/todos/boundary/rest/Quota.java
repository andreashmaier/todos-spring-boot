package de.ars.restSchulung.todos.boundary.rest;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Quota {

    private String besitzer;
    private int grenze;
}
