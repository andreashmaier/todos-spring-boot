package de.ars.restSchulung.todos.boundary;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = {PrioritaetValidator.class})
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPrio {
    String message() default "Prioriät fehlerhaft";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
