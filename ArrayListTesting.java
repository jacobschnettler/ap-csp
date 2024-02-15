// Jacob Schnettler
// 2/12/24

import java.util.ArrayList;

public class ArrayListTesting
{
    public static void outputListHorizontally(ArrayList a) 
    {
        for (int i = 0; i < a.size(); i++)
            System.out.print(a.get(i) + " ");
    }

    public static void outputListVertically(ArrayList a) 
    {
        for (int i = 0; i < a.size(); i++)
            System.out.println(a.get(i) + " ");
    }

    public static int getArrayListSum(ArrayList<Integer> a) 
    {
        int sum = 0;

        for (int i = 0; i < a.size(); i++)
            sum = sum + a.get(i);

        return sum;
    }

    public static int getArrayListMeanAverage(ArrayList<Integer> a) 
    {  
        return getArrayListSum(a) / a.size();
    }

    public static int findMin(ArrayList<Integer> list)
    {
        int min = list.get(0);

        for (int i = 0; i < list.size(); i++)
            if (min > list.get(i))
                min = list.get(i);

        return min;
    }

    public static int linearSearch(ArrayList<Integer> list, Object thing)
    {
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).equals(thing))
                return i;

        return -1;  
    }

    public static int binarySearch(ArrayList<Integer> list, Integer thing)
    {
        int high = list.size() - 1;

        int low = 0;

        int middle = (low + high) / 2;

        while (list.get(middle) != thing)
        {
            if (thing < list.get(middle))
            {
                high = middle - 1;
            } else if (thing > list.get(middle))
            {
                low = middle + 1;
            }

            middle = (low + high) / 2;
        }

        return middle;
    }

    public static void bubbleSort(ArrayList<Integer> list)
    {}

    public static void main()
    {
        ArrayList<Integer> a = new ArrayList<Integer>();

        // Fill ArrayList with 1, 2, 3 .. 10
        for (int i = 0; i < 10; i++)
            a.add(i + 1);

        // System.out.println(a.toString());

        // Method output horizontally
        // outputListHorizontally(a);

        // Method output vertically
        // outputListVertically(a);

        // Method sum
        // System.out.println(getArrayListSum(a));

        // Method mean avg.
        // System.out.println(getArrayListMeanAverage(a));

        // Find min
        // System.out.println(findMin(a));

        // Linear search
        // System.out.println(linearSearch(a, 3));
    }
}
