package com.bridgelabz.userRegistration;
import com.bridgelabz.userRegistration.CustomExceptionClass.*;

public class UserInputValidator {
    private Validator validator = new Validator();

    public boolean validateFirstName(String firstName) {
        try {
            return validator.validate(firstName);
        } catch (InvalidFirstNameException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean validateLastName(String lastName) {
        try {
            return validator.validate(lastName);
        } catch (InvalidLastNameException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean validateEmail(String email) {
        try {
            return validator.validate(email);
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean validateMobile(String mobile) {
        try {
            return validator.validate(mobile);
        } catch (InvalidMobileException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean validatePassword(String password) {
        try {
            return validator.validate(password);
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
