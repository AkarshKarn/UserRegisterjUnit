package org.example;

import java.util.regex.Pattern;

public class UserRegister {
    public boolean validateFirstName(String fName) throws Exception{
        if (Pattern.matches("[A-Z]{1,}[a-z]{3,}",fName))
            return true;
        else
            throw new Exception("Please enter a valid first name");
    }

    public boolean validateLastName(String lName) throws Exception{
        if (Pattern.matches("[A-Z]{1,}[a-z]{3,}",lName))
            return true;
        else
            throw new Exception("Please enter a valid last name");
    }

    public boolean validateEmail(String eMail) throws Exception{
        if (Pattern.matches("^[a-zA-Z0-9.]+@[a-zA-Z0-9.]+$",eMail))
            return true;
        else
            throw new Exception("Please enter a valid e-mail id");
    }

    public boolean validatePassword(String password) throws Exception{
        if (Pattern.matches("([A-Za-z0-9][!@#$%&]{1}+[A-Za-z0-9][!@#$%&]{1}).{8,32}",password))
            return true;
        else
            throw new Exception("Please choose a valid password");
    }

    public boolean validatePhoneNum(String phoneNumber) throws Exception{
        if (Pattern.matches("^[+][1-9].{1,2}[ ][0-9]{10}$",phoneNumber))
            return true;
        else
            throw new Exception("Please enter a valid phone number");
    }


}
