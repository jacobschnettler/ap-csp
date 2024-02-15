public class Rational
{
    private int numerator, denominator;
    
    public Rational() 
    {
        numerator = 4;
        denominator = 5;
    }
    
    public Rational(int _numerator, int _denominator)
    {
        numerator = _numerator;
        denominator = _denominator;
    }
    
    public int setNumerator(int _numerator)
    {
        return numerator = _numerator;
    }
    
    public int setDenominator(int _denominator)
    {
        return denominator = _denominator;
    }
    
    public int getNumerator()
    {
        return numerator;
    }
    
    public int getDenominator()
    {
        return denominator;
    }
    
    public String toString()
    {
        return numerator + "/" + denominator;
    }
    
    public boolean equals(Rational z)
    {
        return numerator == z.getNumerator() && denominator == z.getDenominator();
    }
    
    public double decimal()
    {
        return (numerator * 1.0) / (denominator * 1.0);
    }
}
 