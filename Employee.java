public class Employee
{
    private String name;
    
    private int age;
    
    private char gender;
    
    private int id;
    
    public Employee()
    {
        this.name = "Hello";
        this.age = 18;
        this.gender = 'M';
        this.id = 835772;
    }
    
    public Employee(String name, int age, char gender, int id)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }
    
    public String getName() 
    {
        return name;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public void setAge(int newAge)
    {
        age = newAge;
    }
    
    public char getGender()
    {
        return gender;
    }
    
    public void setGender(char newGender)
    {
        gender = newGender;
    }
    
    public int getID()
    {
        return id;
    }
    
    public void setID(int newID)
    {
        id = newID;
    }
    
    public String toString()
    {
        return "Name: " + name + ", Age: " + age + ", Gender: " + gender + ", ID: " + id;
    }
}
