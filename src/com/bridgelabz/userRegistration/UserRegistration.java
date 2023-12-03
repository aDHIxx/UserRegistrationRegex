package com.bridgelabz.userRegistration;
/*
 * @name: UserRegistration
 * @desc: class to validate user data
 */
public class UserRegistration {
    public static void main(String[] args) {
        Validator nameValidator = new Validator();
        User user = new User("Adhi", "Sree");

        if (nameValidator.validate(user.getFirstName())) {
            System.out.println("First Name is valid");
        } else {
            System.out.println("First Name is invalid");
        }

        if (nameValidator.validate(user.getLastName())) {
            System.out.println("Last Name is valid");
        } else {
            System.out.println("Last Name is invalid");
        }
    }
}