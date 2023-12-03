package com.bridgelabz.userRegistration;

import java.util.regex.Pattern;
import com.bridgelabz.userRegistration.CustomExceptionClass.*;
/*
 * @name: Validator
 * @desc: class to validate user data
 */
public class Validator implements UserValidator{
    private static final String NAME_PATTERN = "^[A-Z][a-zA-Z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,4}([.][a-zA-Z]{2,3})?$";
    private static final String MOBILE_PATTERN = "^[0-9]{2}[\\s][0-9]{10}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]).{8,}$";

    /*
     * @name: validate
     * @desc: method to validate user data
     * @param: data -> user data to be validated
     * @return: boolean -> true if data is valid else false
     */
    @Override
    public boolean validate(String data) {
        Pattern pattern;
        if (data.matches(NAME_PATTERN)) {
            pattern = Pattern.compile(NAME_PATTERN);
        } else if (data.matches(EMAIL_PATTERN)) {
            pattern = Pattern.compile(EMAIL_PATTERN);
        } else if (data.matches(MOBILE_PATTERN)) {
            pattern = Pattern.compile(MOBILE_PATTERN);
        } else {
            pattern = Pattern.compile(PASSWORD_PATTERN);
        }

        if (!pattern.matcher(data).matches()) {
            throwExceptionBasedOnDataType(data);
            return false;
        }

        return true;
    }

    private void throwExceptionBasedOnDataType(String data) {
        if (data.matches(NAME_PATTERN)) {
            throw new InvalidFirstNameException("Invalid First Name: " + data);
        } else if (data.matches(EMAIL_PATTERN)) {
            throw new InvalidEmailException("Invalid Email: " + data);
        } else if (data.matches(MOBILE_PATTERN)) {
            throw new InvalidMobileException("Invalid Mobile Number: " + data);
        } else {
            throw new InvalidPasswordException("Invalid Password: " + data);
        }
    }
}
