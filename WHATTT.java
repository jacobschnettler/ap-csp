
/**
 * Write a description of class WHATTT here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WHATTT
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class WHATTT
     */
    public WHATTT()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    public static boolean isAllowed(String name) { 
        return !name.toLowerCase().equals("david"); 
    }

    public static void main(String args[])
    {
        /*
        int num = 6781123;

        int reversed = 0;

        while(num != 0) {
        int digit = num % 10;

        reversed = reversed * 10 + digit;

        num /= 10;
        }

        System.out.println(reversed);
         */
        
        System.out.println(isAllowed("david"));
    }
}
