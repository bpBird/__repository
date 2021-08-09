package com.birdapp.bp.stock_app.domain.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.birdapp.bp.stock_app.app.form.user.UserPostForm;

import org.springframework.stereotype.Component;

@Component
public class PasswordConfirmationValidator implements ConstraintValidator<PasswordConfirmation, Object> {
    
        @Override
        public void initialize(PasswordConfirmation constraintAnnotation) {
        }
        @Override
        public boolean isValid(Object obj, ConstraintValidatorContext context){
            UserPostForm userPostForm = (UserPostForm) obj;
            return userPostForm.getPassword().equals(userPostForm.getConfirmPassword());
        }
}
