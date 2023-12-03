package com.bridgelabz.userRegistration;

public class CustomExceptionClass {
    public static class InvalidFirstNameException extends RuntimeException {
        public InvalidFirstNameException(String message) {
            super(message);
        }
    }

    public class InvalidLastNameException extends RuntimeException {
        public InvalidLastNameException(String message) {
            super(message);
        }
    }

    public static class InvalidEmailException extends RuntimeException {
        public InvalidEmailException(String message) {
            super(message);
        }
    }

    public static class InvalidMobileException extends RuntimeException {
        public InvalidMobileException(String message) {
            super(message);
        }
    }

    public static class InvalidPasswordException extends RuntimeException {
        public InvalidPasswordException(String message) {
            super(message);
        }
    }

}
