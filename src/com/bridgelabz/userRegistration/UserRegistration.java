package com.bridgelabz.userRegistration;
/*
 * @name: UserRegistration
 * @desc: class to validate user data
 */
public class UserRegistration {
    public static void main(String[] args) {
        Validator firstNameValidator = new Validator();
        User user = new User("Adhi");

        if (firstNameValidator.validate(user.getFirstName())) {
            System.out.println("First Name is valid");
        } else {
            System.out.println("First Name is invalid");
        }
    }
}