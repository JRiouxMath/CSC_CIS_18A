package petdemo;

import java.math.BigInteger;
        
public class PetDemo {

    public static void main(String[] args) {
        Pet dog = new Pet();
                
        dog.name="Sugar";
        dog.setAge(3);
        dog.setWeight(25);
        
        System.out.println(dog.toString());
        
        dog.setAge(-3);
        dog.setWeight(-25);
        
        System.out.printf("Name=%s, Age=%d, Weight=%f\n", dog.name, 
                        dog.getAge(), dog.getWeight());

    }
    
}
