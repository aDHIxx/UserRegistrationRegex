package com.bridgelabz.userRegistration;

import java.util.regex.Pattern;
/*
 * @name: Validator
 * @desc: class to validate user data
 */
public class Validator implements UserValidator{
    private static final String NAME_PATTERN = "^[A-Z][a-zA-Z]{2,}$";

    /*
     * @name: validate
     * @desc: method to validate user data
     * @param: name -> user data to be validated
     * @return: boolean -> true if data is valid else false
     */
    @Override
    public boolean validate(String name) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(name).matches();
    }
}
