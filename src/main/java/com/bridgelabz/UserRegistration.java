package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";

    private static final String EMAIL_PATTERN = "^([a-zA-Z0-9_.$*&!+-]+)@([a-z0-9]+).([a-z.]{2,7})$";

    public static boolean validateFirstName(String FirstName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(FirstName).matches();
    }

    public boolean validateLastName(String LastName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(LastName).matches();
    }

    public boolean validateEmail(String Email) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(EMAIL_PATTERN).matches();
    }


}
