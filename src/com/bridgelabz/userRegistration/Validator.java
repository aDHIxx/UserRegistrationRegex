package com.bridgelabz.userRegistration;

import java.util.regex.Pattern;
/*
 * @name: Validator
 * @desc: class to validate user data
 */
public class Validator implements UserValidator{
    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-zA-Z]{2,}$";

    /*
     * @name: validate
     * @desc: method to validate first name
     * @param: firstName -> first name to be validated
     * @return: boolean -> true if first name is valid else false
     */
    @Override
    public boolean validate(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
}
