public class SearchTesting
{
    public static int linearSearch(Object []arr, Object thing)
    {
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals(thing))
                return i;

        return -1;  
    }

    public static int binarySearch(int [] list, int thing) 
    {
        int high = list.length - 1;

        int low = 0;

        int middle = (low + high) / 2;

        while (list[middle] != thing)
        {
            if (thing < list[middle])
            {
                high = middle - 1;
            } else if (thing > list[middle])
            {
                low = middle + 1;
            }

            middle = (low + high) / 2;
        }

        return middle;
    }

    public static int[] bubbleSortSmart(int arr[])
    {
        boolean swapped = true;

        while(swapped)
        {
            swapped = false;

            for (int i = 0; i < arr.length - 1; i++)
            {
                if (arr[i] > arr[i + 1])
                {
                    swapped = true;

                    int temp = arr[i];

                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main()
    {
        /*
        Object students[] = {
        "Jacob",
        "Braden",
        "Luke",
        false,
        1,
        2,
        3,
        4,
        4.0,
        'A'
        };

        System.out.println(
        linearSearch(students, 4.0)
        );
         */

        int arrayList[] = {
                420, 69, 11, 1, 5, 10, 15, 20, 29, 30, 42, 69, 420
            };

        System.out.println(
            bubbleSortSmart(arrayList)[0]
        );
    }
    
    public void insertSort(int[] numList)
    {
        for (int currIndex = 1; currIndex < numList.length; currIndex++)
        {
            boolean added = false; // used for efficency to end inner loop
            
            for (int sortIndex = 0; !added && sortIndex < currIndex; sortIndex++)
            {
                if ((numList[currIndex] < numList[sortIndex]))
                {
                    int temp = numList[currIndex];
                    
                    for (int moveUpIndex = currIndex; moveUpIndex > sortIndex; moveUpIndex--)
                        numList[moveUpIndex] = numList[moveUpIndex - 1];
                        
                    numList[sortIndex] = temp;
                    
                    added = true;
                }
            }
        }
    }
}
