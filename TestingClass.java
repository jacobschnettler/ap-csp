public class TestingClass
{
    public static void main(String args[])
    {
        /*

        CellMins p = new CellMins();

        CellMins c = new CellMins(20, 100);

        p.setAllowedMins(100);

        System.out.println("Minutes remaining " + c.getMinsRemaining());

        System.out.println(c.toString());

        if (p.equals(c))
        System.out.println("Same cell phone plan");
        else
        System.out.println("Different Cell phone plan");

        c.reset();

        System.out.println(c.getUsedMins() + " " + c.getAllowedMins());

        CellMins t = new CellMins(40, 115);

        CellMins z = new CellMins(t);

        if (c.compareTo(z) > 0)
        System.out.println("C has more minutes left");

         */

        Cube c = new Cube();
        Cube d = new Cube(8);
        
        System.out.println(d.getHeight());
    }
}
