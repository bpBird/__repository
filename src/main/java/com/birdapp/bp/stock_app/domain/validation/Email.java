package com.birdapp.bp.stock_app.domain.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;

/**
 * VALIDATOR ANNOTATION FOR EMAIL.
 *
 * @author bp
 *
 */
@Documented
// @Constraint(validatedBy = {EmailValidator.class})
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@ReportAsSingleViolation
public @interface Email {

	//TODO read about bottom script to understand

	String message() default "{com.birdapp.bp.repository_app.domain.validation.Email.message}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	@Documented
	@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE })
	@Retention(RetentionPolicy.RUNTIME)
	@interface List {
		Email[] value();
	}
}
