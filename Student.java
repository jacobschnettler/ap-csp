public class Student
{
    private String name, idnum;
    private int classRank, grade;
    private double GPA;

    public Student
    (
    String _name,
    String _id,
    int _classRank,
    int _grade,
    double _GPA
    )
    {
        name = _name;
        idnum = _id;
        classRank = _classRank;
        grade = _grade;
        GPA = _GPA;
    }

    public String getName() 
    {
        return name;
    }

    public String getStudentID() 
    {
        return idnum;
    }

    public int getClassRank() 
    {
        return classRank;
    }

    public int getGrade() 
    {
        return grade;
    }

    public double getGPA() 
    {
        return GPA;
    }

    public String getStudentEmail() 
    {
        return idnum + "@students.pmsd.org";
    }
    
    public Boolean compareRanks(Student comparingTo)
    {
        return getClassRank() < comparingTo.getClassRank();
    }
}
 