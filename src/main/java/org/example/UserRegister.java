package org.example;

import java.util.regex.Pattern;

public class UserRegister {
    public boolean validateFirstName(String fName) throws Exception{
        if (Pattern.matches("[A-Z]{1,}[a-z]{3,}",fName))
            return true;
        else
            throw new Exception("Please enter a valid first name");
    }
}
