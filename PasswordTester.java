/*
 * By Jacob Schnettler
 * 10/18/2023
 */

import java.util.Scanner;

public class PasswordTester
{    
    public static String validatePassword(String password) { 
        int minPasswordLength = 6;

        boolean hasEnoughCharacters = false;

        boolean hasSpecialCharacter = false;

        boolean hasNumber = false;

        boolean hasUppercaseLetter = false;

        boolean hasLowercaseLetter = false;

        boolean hasSpaces = false;

        boolean hasInvalidCharacter = false;

        hasEnoughCharacters = password.length() >=  minPasswordLength;

        if (!hasEnoughCharacters) return "Not enough characters.";

        String specialCharacters = "!-_./";

        for (int n = 0; n < password.length(); n++) 
            if (specialCharacters.indexOf(password.substring(n, n + 1)) > -1)
                hasSpecialCharacter = true;

        if (!hasSpecialCharacter) return "Needs a special character (!, -, ., ...etc)";

        String numbersList = "0123456789";

        for (int n = 0; n < password.length(); n++) 
            if (numbersList.indexOf(password.substring(n, n + 1)) > -1)
                hasNumber = true;

        if (!hasNumber) return "Needs a number in the password.";

        /*
        for (int n = 0; n < password.length(); n++) 
            if (password.substring(n, n + 1)) 
            {
              }
        */
              
        return "Good Password.";
    } 

    public static void main(String args[])
    {
        Scanner scanIn = new Scanner(System.in);

        System.out.println("What password do you want too test?");

        String password = scanIn.nextLine();

        System.out.println(
            validatePassword(password)
        );
    }
}
