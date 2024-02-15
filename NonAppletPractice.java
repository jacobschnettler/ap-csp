public class NonAppletPractice
{
    public static int sum(int a, int b)
    {
        return a + b;
    } 

    public static int getSmallest(int n, int m)
    {
        if (n > m) return m;
        else return n;
    }

    public static void outputNum(int x)
    {
        System.out.println("Number is " + x);
    }

    public static boolean isSingleDigit(int num)
    {
        return num >= -9 && num <= 9;
    }

    public boolean is6digits(int num)
    {
        return (num >= -999999 && num <= -100000) || (num >= 100000 && num <= 999999);
    }

    public static boolean isInteger(double num)
    {
        int intPart = (int) num;
        
        return (num - intPart) == 0;
    }
    
    public static void division(int a, int b)
    {
        System.out.println(a/b + " R " + a % b);
    }
    
    public static int numBusses(int students)
    {
           // PRE CONDITION!!!!!!!! students >= 0
           // Post Condition!!!! returns number of busses needed.
           // (50 students max per bus)
           
           //int busCt = students / 50;
           //if (students % 50 > 0)
           // busCt = busCt + 1;
           //return busCt;
           
           return students >= 0 ? (students % 50) != 0 ? (students / 50) + 1 : students / 50 : 0;
    }
    
    public static int f(int x)
    {
        if (x <= 0)
            return 0;
        else 
            return g(x-1);
    }
    
    public static int g(int x)
    {
        if (x <= 0)
        {
            return 0;
        } else {
            return (f(x - 1) + x);
        }
    }
    
    public static void leastCoins(int cents)
    {
        int amountOfQuarters = cents / 25;
        
        int amountOfCentsLeft = cents % 25;
        
        int amoutOfDimes = amountOfCentsLeft / 10;
        
        int amoutOfDimesLeft = amountOfCentsLeft % 10;
        
        int amoutOfNickels = amoutOfDimesLeft / 5;
        
        int amoutOfNickelsLeft = amoutOfDimesLeft % 5;
        
        int amoutOfPennys = amoutOfNickelsLeft / 1;
        
        System.out.println(amountOfQuarters + " Quarters");
        
        System.out.println(amoutOfDimes + " Dimes");
        
        System.out.println(amoutOfNickels + " Nickels");
        
        System.out.println(amoutOfPennys + " Pennys");
    }
    
    public static void main(String[] args)
    {
        leastCoins(6);
        
        //System.out.println(f(6));
        
        //System.out.println(getSmallest(1, 2000));

        //System.out.println(getSmallest(1, 2000))

        //outputNum(5);

        //boolean isSingle = isSingleDigit(9);

        //double test = 123.1;
        
        //System.out.println(numBusses(151));
        //System.out.println(numBusses(150));
        
        //division(26, 7);
        //division(9, 11);
        //division(15, 5);
        //System.out.println(isInteger(test));
        
        /*if (isSingle)
        {
            System.out.println("true");
        } else {
            System.out.println("false");
        }*/

        /*
        for(int b = 0; b <= 20; b++)
        {
        java.awt.Toolkit.getDefaultToolkit().beep();

        try {

        Thread.sleep(500);
        } catch (InterruptedException e) {

        }

        }
         */

        //System.out.println("luke sucks");
    }
}