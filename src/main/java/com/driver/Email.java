package com.driver;

//import java.util.HashSet;

public class Email {

  final  private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }
    public String getEmailId() {
        return emailId;
    }
    public String getPassword() {
        return password;
    }
    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(oldPassword.equals(password)) {
            if (isValid(newPassword)) {
                this.password = newPassword;
            }
    }
}
    public boolean isValid(String input){
        int n = input.length();
        boolean hasLower = false, hasUpper = false,
                hasDigit = false, specialChar = false;

        for (char i : input.toCharArray())
        {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            //if ((i>='0' && i<='9') && !(i>='a' && i<='z') && !(i>='A' && i<='Z') )
            else
                specialChar = true;
        }
        if((n>8) && hasLower && hasDigit && hasUpper && specialChar) return true;
        return false;
    }
}