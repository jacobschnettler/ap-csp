public class EmployeeTest
{
    public static void main(String args[])
    {
        System.out.println("Employee test class");

        SalaryEmployee s = new SalaryEmployee("Joe", 26, 'm', 60934, 544000);

        System.out.println(s.toString());
    }
}
