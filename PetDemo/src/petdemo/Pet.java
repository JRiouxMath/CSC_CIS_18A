package petdemo;

public class Pet {

    // Pet Attributes - by default: public
    String name;
    private double weight;
    private int age;
    
    // getters and setters
    public double getWeight()
    {
        return weight;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public void setWeight(double newWeight)
    {
        if ( newWeight >= 0) weight = newWeight;
        else System.err.printf("Cannot have weight of %f\n",newWeight);
    }
    
    public void setAge(int newAge)
    {
        if ( newAge >= 0) age = newAge;
        else System.err.printf("Cannot have age of %d\n",newAge);
    }
    
    public String toString()
    {
        return "Name: "+name+", Age: "+age+", Weight: "+weight;
    }
}
