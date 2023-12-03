package com.bridgelabz.userRegistration;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
    /*
     * @name: testValidMobileNumber
     * @desc: method to test valid mobile number
     * @param: none
     * @return: none
     */
    @Test
    public void testValidMobileNumber() {
        Validator mobileValidator = new Validator();
        assertTrue(mobileValidator.validate("91 9919819801"));
    }

    /*
     * @name: testValidPassword
     * @desc: method to test valid password
     * @param: none
     * @return: none
     */
    @Test
    public void testValidPassword() {
        Validator passwordValidator = new Validator();
        assertTrue(passwordValidator.validate("Adhi@123"));
    }

    @Test
    public void testValidEmail1() {
        Validator emailValidator = new Validator();
        assertTrue(emailValidator.validate("abc@yahoo.com"));
    }

    @Test
    public void testValidEmail2() {
        Validator emailValidator = new Validator();
        assertTrue(emailValidator.validate("abc-100@yahoo.com"));
    }

    @Test
    public void testValidEmail3() {
        Validator emailValidator = new Validator();
        assertTrue(emailValidator.validate("abc.100@yahoo.com"));
    }

    @Test
    public void testValidEmail4() {
        Validator emailValidator = new Validator();
        assertTrue(emailValidator.validate("abc111@abc.com"));
    }

    @Test
    public void testValidEmail5() {
        Validator emailValidator = new Validator();
        assertTrue(emailValidator.validate("abc-100@abc.net"));
    }

    @Test
    public void testValidEmail6() {
        Validator emailValidator = new Validator();
        assertTrue(emailValidator.validate("abc.100@abc.com.au"));
    }

    @Test
    public void testValidEmail7() {
        Validator emailValidator = new Validator();
        assertTrue(emailValidator.validate("abc@1.com"));
    }

    @Test
    public void testValidEmail8() {
        Validator emailValidator = new Validator();
        assertTrue(emailValidator.validate("abc@gmail.com.com"));
    }

    @Test
    public void testValidEmail9() {
        Validator emailValidator = new Validator();
        assertTrue(emailValidator.validate("abc+100@gmail.com"));
    }

    // Invalid emails
    /*
     * @name: testInvalidEmail1
     * @desc: must contains “@” symbol
     * @param: none
     * @return: none
     */
    @Test
    public void testInvalidEmail1() {
        Validator emailValidator = new Validator();
        assertFalse(emailValidator.validate("abc"));
    }
    /*
     * @name: testInvalidEmail2
     * @desc: can not start with dot “.”
     * @param: none
     * @return: none
     */
    @Test
    public void testInvalidEmail2() {
        Validator emailValidator = new Validator();
        assertFalse(emailValidator.validate("abc@.com.my"));
    }
    /*
     * @name: testInvalidEmail3
     * @desc: “.a” is not a valid tld, last tld must contains at least two characters
     * @param: none
     * @return: none
     */
    @Test
    public void testInvalidEmail3() {
        Validator emailValidator = new Validator();
        assertFalse(emailValidator.validate("abc123@gmail.a"));
    }
    /*
     * @name: testInvalidEmail4
     * @desc: tld can not start with dot “.”
     * @param: none
     * @return: none
     */
    @Test
    public void testInvalidEmail4() {
        Validator emailValidator = new Validator();
        assertFalse(emailValidator.validate("abc123@.com"));
    }
    /*
     * @name: testInvalidEmail5
     * @desc: email’s 1st character can not start with “.”
     * @param: none
     * @return: none
     */
    @Test
    public void testInvalidEmail5() {
        Validator emailValidator = new Validator();
        assertFalse(emailValidator.validate("abc123@.com.com"));
    }

    @Test
    public void testInvalidEmail6() {
        Validator emailValidator = new Validator();
        assertFalse(emailValidator.validate(".abc@abc.com"));
    }

    @Test
    public void testInvalidEmail7() {
        Validator emailValidator = new Validator();
        assertFalse(emailValidator.validate("abc()*@gmail.com"));
    }

    @Test
    public void testInvalidEmail8() {
        Validator emailValidator = new Validator();
        assertFalse(emailValidator.validate("abc@%*.com"));
    }

    @Test
    public void testInvalidEmail9() {
        Validator emailValidator = new Validator();
        assertFalse(emailValidator.validate("abc..2002@gmail.com"));
    }

    @Test
    public void testInvalidEmail10() {
        Validator emailValidator = new Validator();
        assertFalse(emailValidator.validate("abc.@gmail.com"));
    }

    @Test
    public void testInvalidEmail11() {
        Validator emailValidator = new Validator();
        assertFalse(emailValidator.validate("abc@abc@gmail.com"));
    }

    @Test
    public void testInvalidEmail12() {
        Validator emailValidator = new Validator();
        assertFalse(emailValidator.validate("abc@gmail.com.1a"));
    }

    @Test
    public void testInvalidEmail13() {
        Validator emailValidator = new Validator();
        assertFalse(emailValidator.validate("abc@gmail.com.aa.au"));
    }


    private final Validator validator = new Validator();
    /*
     * @name: testValidEmails
     * @desc: method to test valid emails
     * @param: email -> emails to be tested
     * @return: none
     */
    @ParameterizedTest
    @ValueSource(strings = {"adhi@gmail.com", "adh-i@gmail.com", "adhi.100@gmail.com"})
    void testValidEmails(String email) {
        assertTrue(validator.validate(email));
    }

    /*
     * @name: testInvalidEmails
     * @desc: method to test invalid emails
     * @param: email -> emails to be tested
     * @return: none
     */
    @ParameterizedTest
    @ValueSource(strings = {"adhi", "adhi@.com.my", "adhi123@gmail.a"})
    void testInvalidEmails(String email) {
        assertFalse(validator.validate(email));
    }

}
