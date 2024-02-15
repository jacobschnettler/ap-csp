public class HourlyEmployee extends Employee
{
    private double hourlyWage, hoursWorked;
    
    // default
    public HourlyEmployee()
    {
        super();
        
        hourlyWage = 16.50;
        hoursWorked = 69.0;
    }
    
    public HourlyEmployee(String name, int age, char gender, int id, int hourlyWage, int hoursWorked)
    {
        super(name, age, gender, id);
        
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }
    
    public double getHourlyWage()
    {
        return hourlyWage;
    }
    
    public double getHoursWorked()
    {
        return hoursWorked;
    }
    
    public void setHourlyWage(double hourlyWage)
    {
        this.hourlyWage = hourlyWage;
    }
    
    public void setHoursWorked(double hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }
}
