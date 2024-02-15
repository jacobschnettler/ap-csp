public class newClass
{
    public static void main(String args[])
    { 
        int numWays = 0, H = 0;
        
        for (int Q = 0; Q <= 4; Q++)
            for (int D = 0; D <= 10; D++)
                for (int N = 0; N <= 0; N++)
                    for (int P = 0; P <= 100; P = P + 5)
                    {
                        if (25 * Q + 10 * D + 5 * N + P == 100)
                        {
                            numWays++;
                            
                            System.out.println(Q + " Quarters " + D + " Dimes" + N + " Nickels " + P + " Pennies");
                        }
                    }
    }
}
