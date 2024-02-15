public class Box
{
    private double length, width, height;
    
    public Box()
    {
        length = 4;
        width = 5;
        height = 7;
    }
    
    public Box(double x, double y, double z)
    {
        length = x;
        width = y;
        height = z;
    }
    
    public String toString()
    {
        return "Box: Length is " + length;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public double getLength()
    {
        return length;
    }
}
