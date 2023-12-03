package com.bridgelabz.userRegistration;
/*
 * @name: UserRegistration
 * @desc: class to validate user data
 */
public class UserRegistration {
    public static void main(String[] args) {
        Validator validator = new Validator();
        User user = new User("Adhi", "Sree","abc.xyz@bl.co.in","91 9919819801", "Adhi@123");

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
        if (validator.validate(user.getEmail())) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is invalid");
        }

        // Adding mobile number validation
        if (validator.validate(user.getMobileNumber())) {
            System.out.println("Mobile Number is valid");
        } else {
            System.out.println("Mobile Number is invalid");
        }

        // Adding password validation
        if (validator.validate(user.getPassword())) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }
    }
}