
import org.junit.Test;
import static org.junit.Assert.*;

public class FractionsJUnitTest {
    
    public FractionsJUnitTest() {
        System.out.println("Starting FractionsJUnitTest ...");
    }

    @Test
    // test the add method
    public void testAdd()
    {
        
    }
    
    @Test
    // test the subtract method
    public void testSubtract()
    {
        
    }
    
    @Test
    // test the multiply method
    public void testMultiply()
    {
        
    }
    
    @Test
    // test the divide method
    public void testDivide()
    {
        
    }
    
    @Test
    // test the getNumerator method
    public void testGetNumerator()
    {
        
    }
    
    @Test
    // test the setNumerator method
    public void testSetNumerator()
    {
        
    }

    @Test
    // test the getDenominator method
    public void testGetDenominator()
    {
        
    }

    @Test
    // test the setDenominator method
    public void testSetDenominator()
    {
        
    }
    
    @Test
    // test the getValue method
    public void testGetValue()
    {
        
    }
    
    @Test
    // test the equals method
    public void testEquals()
    {
        
    }    
    
    @Test
    // test the toString method
    public void testToString()
    {
        
    }    
    
    @Test
    // test the protected gcd function
    public void testGCD()
    {
        System.out.println("Testing gcd function...");
        Fractions inst = new Fractions();
        
        int expectedValue = 3;
        int actualValue = inst.gcd(3, 1);
        
        assertEquals(actualValue,expectedValue);
    }
}
