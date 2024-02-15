import java.util.*;   

public class NestedLoop
{
    public static void main(String args[])
    { 
        String newString = "";

        Scanner scanIn = new Scanner(System.in);

        System.out.println("Type a new string to reverse it.");

        String _string = scanIn.nextLine();

        for (int i = 0; i <= _string.length() - 1; i++)
        {
            String newLettersAtIndex = "";

            String characterAtIndex = _string.substring(i, i + 1);

            for (int b = 0; b <= i; b++)
            {
                newLettersAtIndex = newLettersAtIndex + characterAtIndex;
            }
            
            newString = newString + newLettersAtIndex;
        }
        
        System.out.println(newString);
    }
}
