import java.util.*;   

public class Encrypter
{
    public static String getCipher(String word)
    {
        String alphabet = "zyxwvutsrqponmlkjihgfedcba";

        String originalWord = word.toLowerCase();

        String alteredWord = "";

        String alteredAlphabet = "";

        for (int n = 0; n <= originalWord.length() - 1; n = n + 1)
        {    
            String character = originalWord.substring(n, n + 1);

            if (alteredWord.indexOf(character) == -1)
                alteredWord = alteredWord + character;
        }

        for (int n = 0; n <= alphabet.length() - 1; n = n + 1)
        {    
            String character = alphabet.substring(n, n + 1);

            if (alteredWord.indexOf(character) == -1)
                alteredAlphabet = alteredAlphabet + character;
        }

        return alteredWord + alteredAlphabet; 
    }

    public static String getEncryptedWord(String cipher, String word)
    {
        String alphabet = "zyxwvutsrqponmlkjihgfedcba";

        String encrypt = "";

        for (int p = 0; p < word.length(); p++)
            encrypt = encrypt + cipher.substring(alphabet.indexOf(word.substring(p, p + 1), alphabet.indexOf(word.substring(p, p + 1) + 1)));

        return encrypt;
    }

    public static void main(String args[])
    {
        Scanner scanIn = new Scanner(System.in);
        
        System.out.println("What password do you want too encrypt?");

        String password = scanIn.nextLine();

        System.out.println(getEncryptedWord(getCipher(password), password));
    }
}
