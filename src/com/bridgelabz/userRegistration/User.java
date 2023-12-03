package com.bridgelabz.userRegistration;

/*
 * @name: User
 * @desc: class to store user data
 */
class User {
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private String password;

    /*
     * @name: User
     * @desc: constructor for User class
     * @param: firstName -> first name of user
     * @param: lastName -> last name of user
     * @param: mobileNumber -> mobile number of user
     */
    public User(String firstName, String lastName,String email, String mobileNumber, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.password = password;
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

    /*
     * @name: getMobileNumber
     * @desc: method to get mobile number of user
     * @return: String -> mobile number of user
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /*
     * @name: setMobileNumber
     * @desc: method to set mobile number of user
     * @param: mobileNumber -> mobile number of user
     */
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    /*
     * @name: getEmail
     * @desc: method to get email of user
     * @return: String -> email of user
     */
    public String getEmail() {
        return email;
    }

    /*
     * @name: setEmail
     * @desc: method to set email of user
     * @param: email -> email of user
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /*
     * @name: getPassword
     * @desc: method to get password of user
     * @return: String -> password of user
     */
    public String getPassword() {
        return password;
    }

    /*
     * @name: setPassword
     * @desc: method to set password of user
     * @param: password -> password of user
     */
    public void setPassword(String password) {
        this.password = password;}

}

