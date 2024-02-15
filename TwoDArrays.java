import java.io.*; 
import java.util.*; 

public class TwoDArrays
{
    public static void output2Darray(int[][] testArray)
    {
        for (int r = 0; r <= testArray.length - 1; r++)
        {
            for (int c = 0; c <= testArray[0].length - 1; c++)
            {
                System.out.print(testArray[r][c] + " ");
            }

            System.out.println("");
        }
    }

    public static int sum(int [][] numArray)
    {
        int sum = 0;

        for (int r = 0; r <= numArray.length - 1; r++)
            for (int c = 0; c <= numArray[0].length - 1; c++)
                sum += numArray[r][c];

        return sum;
    }

    public static int meanAvg(int [][] numArray)
    {
        int sumTotal = sum(numArray);

        int length = numArray.length * numArray[0].length;

        return sumTotal / length;
    }

    public static void flipUpsideDown(int arr[][])
    {
        int numRows = arr.length;

        for (int r = 0; r < arr.length / 2; r++)
            for (int c = 0; c < arr[0].length; c++)
            {
                int temp = arr[r][c];
                arr[r][c] = arr[numRows - r - 1][c];
                arr[numRows - r - 1][c] = temp;
            }
    }

    public static void flipLeftToRight(int arr[][]) {
        int rows = arr.length;

        int cols = arr[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][cols - j - 1];
                arr[i][cols - j - 1] = temp;
            }
        }
    }

    public static void rotate180(int arr[][])
    {
        flipUpsideDown(arr);
        flipLeftToRight(arr);
    }

    public static int[] convertToOnedArray(int arr[][])
    {
        int [] newArray = new int[arr.length * arr[0].length];

        int ctr = 0;

        for (int r = 0; r < arr.length; r++)
            for (int c = 0; c < arr[0].length; c++)
            {
                newArray[ctr] = arr[r][c]; 
                ctr++;
            }

        return newArray;
    }

    public static int sumDownDiagonal(int arr[][])
    {
        return -1;
    }

    public static int sumUpDiagonal(int arr[][])
    {
        return -1;
    }

    public static void main()
    {
        int [][] testArray = new int[25][1];

        for (int r = 0; r <= testArray.length - 1; r++)
            for (int c = 0; c <= testArray[0].length - 1; c++)
            // testArray[r][c] = (int) (Math.random() * 9);
                testArray[r][c] = r + 10;
                
                flipUpsideDown(testArray);

        System.out.println(Arrays.toString(testArray));

        System.out.println(convertToOnedArray(testArray).length);

        /*
        System.out.println("Current:");

        output2Darray(testArray);

        flipUpsideDown(testArray);

        System.out.println("New:");

        output2Darray(testArray);
         */

        // System.out.println(meanAvg(testArray));
    }
}
