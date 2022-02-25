package de.ars.restSchulung.todos.boundary;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PrioritaetValidator implements ConstraintValidator<ValidPrio, Integer> {


    @Override
    public boolean isValid(Integer prio, ConstraintValidatorContext constraintValidatorContext) {
        return prio > 0 && prio <= 10;
    }
}
