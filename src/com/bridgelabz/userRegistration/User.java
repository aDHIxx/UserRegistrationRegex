package com.bridgelabz.userRegistration;
/*
 * @name: User
 * @desc: class to store user data
 */
class User {
    private String firstName;
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
}
