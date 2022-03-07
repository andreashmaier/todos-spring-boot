package de.ars.restSchulung.todos.boundary.rest;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Quota {

    private String besitzer;
    @Setter(AccessLevel.NONE)
    private int grenze;
}
