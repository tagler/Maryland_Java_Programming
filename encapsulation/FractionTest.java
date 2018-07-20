package assignments.encapsulation;

public class FractionTest {
	
    public static void main(String args[]) {
    	
        Fraction a = new Fraction(3,7);
        Fraction b = new Fraction(2,3);
        
        Fraction c = a.multiply(b);
        System.out.println(c);
        
        c = a.add(b);
        System.out.println(c);
        
        c = a.subtract(b);
        System.out.println(c);
        
        c = a.divide(b);
        System.out.println(c);
    }
    
}