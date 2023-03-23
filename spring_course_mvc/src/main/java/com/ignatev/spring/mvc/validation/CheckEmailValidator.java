package com.ignatev.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator
        implements ConstraintValidator<CheckEmail, String> {
    private String endOfEmail;
    public void initialize(CheckEmail checkEmail) {
        endOfEmail = checkEmail.value();
    }

    public boolean isValid(String enteredValue,
                           ConstraintValidatorContext constraintValidatorContext) {
        return enteredValue.endsWith(endOfEmail);
    }
}
