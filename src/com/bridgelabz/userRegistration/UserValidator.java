package com.bridgelabz.userRegistration;

/*
 * UserValidator interface to validate user data
 */
interface UserValidator {
    /*
     * @name: validate
     * @desc: abstract method to validate user data
     * @param: data -> user data to be validated
     * @return: boolean -> true if data is valid else false
     */
    boolean validate(String data);
}
