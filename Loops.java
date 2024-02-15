import java.util.Scanner;

public class Loops
{
    public static int sum_old(int length)
    {
        //precondition: numso
        //postcondition: output a list of word(see other board)

        int counter = 0;

        for (int n = 1; n <= length; n = n + 1)
            counter = counter + n;

        return counter;
    }

    public static int sum(int start, int end)
    {
        // precondition: start <= end
        // postcondition: return start + (start + 1) + (start + 2)... + end

        int counter = 0;

            for (int n = start; n <= end; n = n + 1)
            counter = counter + n;

        return counter;
    }

    public static void outputWord(int length, String keyword)
    {
        //precondition: numso
        //postcondition: output a list of word(see other board)

        for (int n = 1; n <= 10; n = n + 1)
        {
            if (n <= 9) {
                System.out.println(" " + n + ". " + keyword);
            } else {
                System.out.println(n + ". " + keyword);
            }
        }
    }

    public static void createTable()
    {
        //outputWord(10, "Luciano")

        System.out.println("n   | Sum 1 to n");
        System.out.println("--------------");

        for (int n = 1; n <= 10; n = n + 1)
        {
            if (n <= 9) {
                System.out.println(n + "   |   " + sum(1, n));
            } else {
                System.out.println(n + "  |   " + sum(1, n));
            }
        }
    }

    public static double power(double base, int exponent)
    {
        if (exponent == 0) return 1;

        int _exponent = exponent < 0 ? Math.abs(exponent) : exponent;

        double answer = 1.0;

        for (int i = 1; i <= _exponent; i++)
            answer*=base;

        return answer;
    }

    public static int properFactorSum(int num)
    {
        int counter = 0;

        for (int i = 1; i <= num - 1; i++)
            if (num % i == 0) counter = counter + i;

        return counter;
    }

    public static int GCF(int num1, int num2)
    {
        // Pre condition: num1>0 && num2>0
        // Post conidition: return GCF of num1 and num2 \

        int smallerNumber = num1 < num2 ? num1 : num2;

        for (int div = smallerNumber; div >= 2; div--)
            if (num1 % div == 0 && num2 % div == 0)
                return div;

        return 1;
    }

    public void outputsDigitsForward(int num1)
    {
        String s = Integer.toString(num1);

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(s.length() - i));
        }
    }

    public static int numDigits(int num)
    {
        int counter = 0;

        do 
        {
            num = num / 10;
            counter++;
        }
        while (num > 0);

        return counter;
    }

    public static int displayDigitsinReverse(int num)
    {
        while (num != 0)
        {
            System.out.println(num % 10);

            num = num / 10;
        }

        return 0;
    }

    public static void outputDigitsInOrder(int num)
    {
        int numberOfDigits = numDigits(num);

        for (int n = 0; n <= numberOfDigits; n = n + 1)
            System.out.println(num % 10);
    }

    public static void main(String args[])
    {
        boolean exited = false;

        while (true);
        
        /*
        while (!exited)
        {
            Scanner scanin = new Scanner(System.in);

            System.out.println("Enter a number");

            String input = scanin.nextLine();

            int num = Integer.parseInt(input);

            if (num == -999) exited = true;
            else displayDigitsinReverse(num);   
        }
        */

        //outputDigitsInOrder(4578);

        //outputWord(10, "Luciano")

        //createTable();

        //System.out.println(power(2, -5));

        /*

        // 1 --
        System.out.println("#1");
        String nums = "";
        for (int n = 1; n <= 8; n = n + 1)
        nums = nums + "" + n + " ";

        System.out.println(nums);

        // 2 -----

        System.out.println("#2");

        int counter = 0;
        String nums2 = "";

        for (int n = 1; counter < 400; n = n + 1)
        {   
        nums2 = nums2 + "" + (counter + 4) + " ";

        counter = counter + 4;
        }

        System.out.println(nums2);

        // 3 ------
        System.out.println("#3");
        int counter2 = 0;
        int counter3 = 0;

        for (int n = 1; counter2 < 400; n = n + 1)
        {   
        counter2 = counter2 + 4;

        counter3 = counter3 + (counter2 + 4);
        }

        System.out.println(counter3);

        // 4 --------
        System.out.println("#4");
        for (int n = 1; n <= 20; n = n + 1)
        System.out.println(105 - (n * 5));

        // 5 --------

        System.out.println("#5");

        for (int n = 1; n <= 4096; n = n * 4)
        System.out.println(n);

        //System.out.println(
        //     properFactorSum(20)
        //);

         */

        //System.out.println(GCF(22, 20));
    }
}
