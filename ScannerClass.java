import java.util.Scanner;

public class ScannerClass
{
    public static void main(String []args)
    {
        Scanner scanln = new Scanner(System.in);

        System.out.print("Enter Row");

        String input = scanln.nextLine();

        int row = Integer.parseInt(input);

        System.out.print("Enter column");

        input = scanln.nextLine();

        int col = Integer.parseInt(input);
    }
}
