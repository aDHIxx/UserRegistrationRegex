package com.bridgelabz.userRegistration;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidatorJUnitTest {
    /*
     * @name: testValidFirstName
     * @desc: method to test valid first name
     * @param: none
     * @return: none
     */
    @Test
    public void testValidFirstName() {
        Validator firstNameValidator = new Validator();
        assertTrue(firstNameValidator.validate("Adhi"));
    }
    /*
     * @name: testInvalidFirstName
     * @desc: method to test invalid first name
     * @param: none
     * @return: none
     */
    @Test
    public void testInvalidFirstNameLength() {
        Validator firstNameValidator = new Validator();
        assertFalse(firstNameValidator.validate("Ad"));
    }
    /*
     * @name: testInvalidFirstName
     * @desc: method to test invalid first name
     * @param: none
     * @return: none
     */
    @Test
    public void testInvalidFirstNameStartsWithLowercase() {
        Validator firstNameValidator = new Validator();
        assertFalse(firstNameValidator.validate("adhiSree"));
    }

}
