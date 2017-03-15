public class Complex {
    private double real = 0.0;
    private double imaginary = 0.0;

    // constructor
    public Complex(double real, double imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;
    }
    
    /**
     * @return the real
     */
    public double getReal() {
        return this.real;
    }

    /**
     * @param real the real to set
     */
    public void setReal(double real) {
        this.real = real;
    }

    /**
     * @return the imaginary
     */
    public double getImaginary() {
        return this.imaginary;
    }

    /**
     * @param imaginary the imaginary to set
     */
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
    
    public Complex add(Complex c2)
    {
        double a1=this.real;
        double b1=this.imaginary;
        double a2=c2.real;
        double b2=c2.imaginary;
        
        Complex result = new Complex(a1+a2,b1+b2);
        return result;
    }
    
    public Complex subtract(Complex c2)
    {
        double a1=this.real;
        double b1=this.imaginary;
        double a2=c2.real;
        double b2=c2.imaginary;
        
        Complex result = new Complex(a1-a2,b1-b2);
        return result;
    }
    
    public Complex multiply(Complex c2)
    {
        double a1=this.real;
        double b1=this.imaginary;
        double a2=c2.real;
        double b2=c2.imaginary;
        
        Complex result = new Complex(a1*a2-b1*b2,a1*b2+a2*b1);
        return result;
    }
    
    public Complex divide(Complex c2)
    {
        double a1=this.real;
        double b1=this.imaginary;
        double a2=c2.real;
        double b2=c2.imaginary;
        double denom=a2*a2+b2*b2;
        
        Complex result = new Complex( (a1*a2+b1*b2)/denom,(a2*b1-a1*b2)/denom );
        return result;
    }
}
