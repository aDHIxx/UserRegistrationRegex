package com.bridgelabz.userRegistration;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class UserInputJUnitTest {
    private UserInputValidator userInputValidator;

    @Before
    public void setUp() {
        userInputValidator = new UserInputValidator();
    }
    // UC10: Happy Test Case
    @Test
    public void testValidUserInp() {
        User user = new User("Adhi", "Sree", "adhi.sree@example.com", "91 9876543210", "Adhi@123");
        assertTrue(userInputValidator.validateFirstName(user.getFirstName()));
        assertTrue(userInputValidator.validateLastName(user.getLastName()));
        assertTrue(userInputValidator.validateEmail(user.getEmail()));
        assertTrue(userInputValidator.validateMobile(user.getMobileNumber()));
        assertTrue(userInputValidator.validatePassword(user.getPassword()));
        boolean result = userInputValidator.validateFirstName(user.getFirstName()) && userInputValidator.validateLastName(user.getLastName()) && userInputValidator.validateEmail(user.getEmail()) && userInputValidator.validateMobile(user.getMobileNumber()) && userInputValidator.validatePassword(user.getPassword());
        System.out.println("Validation Result: " + (result ? "Happy" : "Sad"));
    }

    // UC10: Sad Test Case
    @Test
    public void testInvalidUserInp() {
        User user = new User("A", "S", "aaaa", "9876543210", "pass");
        assertFalse(userInputValidator.validateFirstName(user.getFirstName()));
        assertFalse(userInputValidator.validateLastName(user.getLastName()));
        assertFalse(userInputValidator.validateEmail(user.getEmail()));
        assertFalse(userInputValidator.validateMobile(user.getMobileNumber()));
        assertFalse(userInputValidator.validatePassword(user.getPassword()));
        boolean result = userInputValidator.validateFirstName(user.getFirstName()) && userInputValidator.validateLastName(user.getLastName()) && userInputValidator.validateEmail(user.getEmail()) && userInputValidator.validateMobile(user.getMobileNumber()) && userInputValidator.validatePassword(user.getPassword());
        System.out.println("Validation Result: " + (result ? "Happy" : "Sad"));
    }
}
