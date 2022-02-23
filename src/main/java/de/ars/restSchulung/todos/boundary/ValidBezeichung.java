package de.ars.restSchulung.todos.boundary;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@NotNull
@Pattern(regexp = "[A-Z].*")
@Size(min = 3, max = 15)
@ReportAsSingleViolation
@Constraint(validatedBy = {})
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidBezeichung {
    String message() default "Bezeichnung fehlerhaft";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
