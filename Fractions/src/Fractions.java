// Do not implement any of the logic for the class until we have written at 
// least two tests per method!!!

public class Fractions {
// private member attributes (also known as properties)
    
    public Fractions()
    {
        throw new UnsupportedOperationException("Fractions() not yet implemented");
    }
    
    public Fractions(int n, int d)
    {
        throw new UnsupportedOperationException("Fractions(int, int) not yet implemented");    
    }
    
    public Fractions add(Fractions f2)
    {
        throw new UnsupportedOperationException("add(Fractions) not yet implemented");
    }
    
    public Fractions subtract(Fractions f2)
    {
        throw new UnsupportedOperationException("subtract(Fractions) not yet implemented");
    }
    
    public Fractions multiply(Fractions f2)
    {
        throw new UnsupportedOperationException("multiply(Fractions) not yet implemented");
    }
    
    public Fractions divide(Fractions f2)
    {
        throw new UnsupportedOperationException("divide(Fractions) not yet implemented");
    }
    
    public int getNumerator() {
        throw new UnsupportedOperationException("getNumerator() not yet implemented");
    }

    public void setNumerator(int numerator) {
        throw new UnsupportedOperationException("setNumerator(int) not yet implemented");
    }

    public int getDenominator() {
        throw new UnsupportedOperationException("getDenominator() not yet implemented");
    }

    public void setDenominator(int denominator) {
        throw new UnsupportedOperationException("setDenominator(int) not yet implemented");
    }
    
    public double getValue()
    {
        throw new UnsupportedOperationException("getValue() not yet implemented");
    }   
    
    public boolean equals(Fractions F2)
    {
        throw new UnsupportedOperationException("equals(Fractions) not yet implemented");
    }
    
    @Override
    public String toString()
    {
        throw new UnsupportedOperationException("toString() not yet implemented");
    }
    
    // gcd is a private utility method only for use by the Fractions class
    protected int gcd(int a, int b)
    {
        if (a==0) return b;
        return gcd( b%a, a);
    }    
}
