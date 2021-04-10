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
    void givenFirstName_WhenShort_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateFirstName("ma");
        Assertions.assertFalse(result);
    }
}
