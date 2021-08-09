package com.birdapp.bp.stock_app.domain.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordConfirmationValidator.class)
@Documented
public @interface PasswordConfirmation {

    String message() default "Passwords don't match";
    
    Class<?>[] groups() default {};
    
    Class<? extends Payload>[] payload() default {};

}
