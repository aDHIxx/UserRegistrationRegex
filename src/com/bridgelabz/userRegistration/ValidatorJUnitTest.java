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
     * @name: testInvalidFirstNameLength
     * @desc: method to test invalid first name based on length
     * @param: none
     * @return: none
     */
    @Test
    public void testInvalidFirstNameLength() {
        Validator firstNameValidator = new Validator();
        assertFalse(firstNameValidator.validate("Ad"));
    }
    /*
     * @name: testInvalidFirstNameWithLowerCase
     * @desc: method to test invalid first name based on format
     * @param: none
     * @return: none
     */
    @Test
    public void testInvalidFirstNameStartsWithLowercase() {
        Validator firstNameValidator = new Validator();
        assertFalse(firstNameValidator.validate("adhiSree"));
    }
    /*
     * @name: testValidLastName
     * @desc: method to test valid last name
     * @param: none
     * @return: none
     */
    @Test
    public void testValidLastName() {
        Validator lastNameValidator = new Validator();
        assertTrue(lastNameValidator.validate("Sree"));
    }
    /*
     * @name: testInvalidLastNameLength
     * @desc: method to test invalid last name based on length
     * @param: none
     * @return: none
     */
    @Test
    public void testInvalidLastNameLength() {
        Validator lastNameValidator = new Validator();
        assertFalse(lastNameValidator.validate("Do"));
    }
    /*
     * @name: testInvalidLastNameFormat
     * @desc: method to test invalid last name based on format
     * @param: none
     * @return: none
     */
    @Test
    public void testInvalidLastNameFormat() {
        Validator lastNameValidator = new Validator();
        assertFalse(lastNameValidator.validate("doe"));
    }
    /*
     * @name: testInvalidLastNameStartsWithLowerCase
     * @desc: method to test invalid last name based on format
     * @param: none
     * @return: none
     */
    @Test
    public void testInvalidLastNameStartsWithLowercase() {
        Validator lastNameValidator = new Validator();
        assertFalse(lastNameValidator.validate("doeSmith"));
    }
    /*
     * @name: testValidEmail
     * @desc: method to test valid email
     * @param: none
     * @return: none
     */
    @Test
    public void testValidEmail() {
        Validator emailValidator = new Validator();
        assertTrue(emailValidator.validate("abc.xyz@bl.co.in"));
    }

}
