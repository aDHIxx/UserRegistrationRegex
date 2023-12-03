package com.bridgelabz.userRegistration;
/*
 * @name: User
 * @desc: class to store user data
 */
class User {
    private String firstName;
    private String lastName;
    /*
     * @name: User
     * @desc: constructor for User class
     * @param: firstName -> first name of user
     * @param: lastName -> last name of user
     */
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    /*
     * @name: User
     * @desc: constructor for User class
     * @param: firstName -> first name of user
     */
    public User(String firstName) {
        this.firstName = firstName;
    }
    /*
     * @name: getFirstName
     * @desc: method to get first name of user
     * @return: String -> first name of user
     */
    public String getFirstName() {
        return firstName;
    }
    /*
     * @name: setFirstName
     * @desc: method to set first name of user
     * @param: firstName -> first name of user
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /*
     * @name: getLastName
     * @desc: method to get last name of user
     * @return: String -> last name of user
     */
    public String getLastName() {
        return lastName;
    }
    /*
     * @name: setLastName
     * @desc: method to set last name of user
     * @param: lastName -> last name of user
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
