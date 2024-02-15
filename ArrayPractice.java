public class ArrayPractice
{
    public static void outputVert(double anyArray[])
    {
        System.out.println("");

        for (int i = 0; i < anyArray.length; i++)
            System.out.print(anyArray[i] + " ");
    }

    public static void outputHorizontal(double anyArray[])
    {
        System.out.println("");

        for (int i = 0; i < anyArray.length; i++)
            System.out.println(anyArray[i] + " ");
    }

    public static double[] addTen(double anyArray[])
    {
        double newArray[] = new double[anyArray.length];

        for (int i = 0; i < anyArray.length; i++)
            newArray[i] = anyArray[i] + 10;

        return newArray;
    }

    public static double getSum(double anyArray[])
    {
        double sum = 0.0;

        for (int i = 0; i < anyArray.length; i++)
            sum = sum + anyArray[i];

        return sum;
    }

    public static double getAverage(double anyArray[])
    {
        double sum = getSum(anyArray);

        double average = sum / anyArray.length;

        return average;
    }

    public int countNegitives(double anyArray[])
    {
        int negitives = 0;

        for (int i = 0; i < anyArray.length; i++)
            if (anyArray[i] > 0)
                negitives++;

        return negitives;
    }

    public static double getLowest(double anyArray[])
    {
        double lowest = anyArray[0];

        for (int i = 0; i < anyArray.length; i++)
            if (anyArray[i] < lowest)
                lowest = anyArray[i];

        return lowest;
    }

    public static String outputLetterGrades(double anyArray[])
    {
        int AGrades = 0;
        int BGrades = 0;
        int CGrades = 0;
        int DGrades = 0;
        int FGrades = 0;
        
        /*

        for (int i = 0; i < anyArray.length; i++)
            if (anyArray[i] < lowest)
                lowest = anyArray[i];
                
        */
        
        return "A";
    }

    public static void main(String args[])
    {
        double doubleTestArray[] = {
                11.2,
                33.4
            };

        outputVert(doubleTestArray);

        outputHorizontal(doubleTestArray);

        double doubleTestArray2[] = {
                5.4,
                6.1,
                1.9,
                9.3
            };

        outputVert(
            addTen(doubleTestArray2)
        );

        System.out.print(
            getSum(doubleTestArray2)
        );

        System.out.print(
            getAverage(doubleTestArray2)
        );
        
        double grades[] = {
                100.0,
                78.5,
                31.4,
                0.0,
                100.0,
                78.0
            };

        System.out.print(
            outputLetterGrades(grades)
        );
    }
}
