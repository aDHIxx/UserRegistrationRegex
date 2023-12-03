package com.bridgelabz.userRegistration;
/*
 * @name: UserRegistration
 * @desc: class to validate user data
 */
public class UserRegistration {
    public static void main(String[] args) {
        Validator validator = new Validator();
        User user = new User("Adhi", "Sree");

        if (validator.validate(user.getFirstName())) {
            System.out.println("First Name is valid");
        } else {
            System.out.println("First Name is invalid");
        }

        if (validator.validate(user.getLastName())) {
            System.out.println("Last Name is valid");
        } else {
            System.out.println("Last Name is invalid");
        }

        // Adding email validation
        String email = "abc.xyz@bl.co.in";
        if (validator.validate(email)) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is invalid");
        }
    }
}