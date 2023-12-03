package com.bridgelabz.userRegistration;

public class UserInputValidator {
    private Validator validator = new Validator();

    public boolean validateFirstName(String firstName) {
        return validator.validate(firstName);
    }

    public boolean validateLastName(String lastName) {
        return validator.validate(lastName);
    }

    public boolean validateEmail(String email) {
        return validator.validate(email);
    }

    public boolean validateMobile(String mobile) {
        return validator.validate(mobile);
    }

    public boolean validatePassword(String password) {
        return validator.validate(password);
    }
}
