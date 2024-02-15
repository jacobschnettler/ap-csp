public class StudentTest
{
    public static void main(String args[])
    { 
        Student luke = new Student("Lucas", "309810", 399, 11, 97.0);
        Student braden = new Student("Braden", "308177", 130, 12, 87.0);
        
        System.out.println("Hi my name is " + luke.getName() + ", my email is " + luke.getStudentEmail());
        System.out.println("Hi my name is " + braden.getName() + ", my email is " + braden.getStudentEmail());
        
        if (braden.compareRanks(luke))
        {
            System.out.println(braden.getName() + " has a higher class rank than " + luke.getName());
        } else {
            System.out.println(luke.getName() + " has a higher class rank than " + braden.getName());
        }
        
        // System.out.println("Braden has a higher class rank " + (braden.compareRanks(luke) ? "true" : "false"));
    }
}
