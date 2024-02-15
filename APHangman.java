
/**
 * @author Jacob Schnettler
 * @date 10/27/23
 */

import java.util.*;

public class APHangman
{
    public static void main(String args[])
    {
        String secretWord = "underwear"; // step (1)

        String dashes = "---------"; // step (2)

        String letterGuess = ""; // Step (3)

        String correctGuessedLetters = "";
        
        int guessesWrong = 6; // Step (9) - count how many times 

        while (guessesWrong > 0 && !dashes.equals(secretWord)) {
            System.out.println(dashes); // print dashes (step 4)

            System.out.println("Please type a letter on the keyboard then press enter to guess");

            Scanner scanIn = new Scanner(System.in); // step (5)

            String _string = scanIn.nextLine();   

            String letterGuessed = _string.substring(0, 1).toLowerCase();   

            letterGuess = letterGuess + letterGuessed; // step (6)

            if (secretWord.indexOf(letterGuessed) != -1) { // step (7)
                // Good guess
                String newDashesString = "";

                // step (8)
                for (int i = 0; i <= secretWord.length() - 1; i++)
                {
                    if (secretWord.substring(i, i + 1).equals(letterGuessed)) 
                    {
                        newDashesString = newDashesString + letterGuessed;

                        correctGuessedLetters = correctGuessedLetters + letterGuessed;
                    } else {
                        boolean alreadyGuessed = false;

                        for (int b = 0; b <= correctGuessedLetters.length() - 1; b++)
                        {
                            if (correctGuessedLetters.substring(b, b + 1).equals(secretWord.substring(i, i + 1)))
                            {
                                alreadyGuessed = true;
                            } 

                        }
                        
                        if (alreadyGuessed) 
                            newDashesString = newDashesString + secretWord.substring(i, i + 1);
                        else
                            newDashesString = newDashesString + "-";
                    }
                }

                dashes = newDashesString;
            } else {
                // Bad guess
                    
                guessesWrong--;
                
                System.out.println("Wrong! You have " + guessesWrong + " more tries");
            } 
            
            if (dashes.equals(secretWord)) 
            {
                System.out.println("You guessed " + secretWord);
            }
        }
    }
}
