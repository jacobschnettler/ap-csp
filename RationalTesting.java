public class RationalTesting
{
    public static void main(String args[])
    {
        Rational r = new Rational();
           
        Rational z = new Rational(4, 5);

        r.setNumerator(4);

        r.setDenominator(5);

        double deci = r.decimal();
        
        System.out.println(deci);

        int top = r.getNumerator();

        int bottom = r.getDenominator();

        System.out.println(z.toString());

        if (r.equals(z))
            System.out.println(r.toString() + " is the same as " + z.toString());
        else
            System.out.println(r.toString() + " is not the same as " + z.toString());

    }
}
