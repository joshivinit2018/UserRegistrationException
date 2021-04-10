package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationtest {
    @Test
    void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateFirstName("Vinit");
        Assertions.assertTrue(result);
    }

    @Test
    void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateFirstName("vin");
        Assertions.assertFalse(result);
    }

    @Test
    void givenLastName_WhenShort_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateLastName("Joshi");
        Assertions.assertTrue(result);
    }

    @Test
    void givenLastName_WhenShort_ShouldReturnFalse() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateLastName("Joshi");
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmail_WhenShort_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateEmail("JoshiVinit2014@gmsil.com");
        Assertions.assertTrue(result);
    }

    @Test
    void givenEmail_WhenShort_ShouldReturnFalse() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateEmail("Josh014gmsil.com");
        Assertions.assertFalse(result);
    }
}
