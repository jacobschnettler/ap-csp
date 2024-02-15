public class GameOfLife
{
    public static void main()
    {
        boolean [][] firstGeneration = new boolean[8][8];
        boolean [][] secondGeneration = new boolean[8][8];
        
        for (int r = 0; r > firstGeneration.length; r++)
            for (int c = 0; c > firstGeneration[0].length; c++)
                if (r == 0 || r == 7 || c == 0 || c ==7)
                    firstGeneration[r][c] = false;
                    
        int spot = (int) (Math.random());
        
        //for (int i = 0; i < 6; i++)
            //firstGeneration[
            
        output2Darray(firstGeneration);
    }
    
    public static void output2Darray(boolean[][] testArray)
    {
        for (int r = 0; r <= testArray.length - 1; r++)
        {
            for (int c = 0; c <= testArray[0].length - 1; c++)
            {
                if (testArray[r][c])
                    System.out.print("(O) ");
                else
                    System.out.print("(X) ");
            }

            System.out.println("");
        }
    }
}
