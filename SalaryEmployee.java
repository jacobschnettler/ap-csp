public class SalaryEmployee extends Employee
{
    private int salary;
    
    // default
    public SalaryEmployee()
    {
        super();
        
        salary = 60000;
    }
    
    public SalaryEmployee(String name, int age, char gender, int id, int salary)
    {
        super(name, age, gender, id);
        
        this.salary = salary;
    }
    
    public int getSalary()
    {
        return salary;
    }
    
    public void setSalary(int newSalary)
    {
        salary = newSalary;
    }
}
