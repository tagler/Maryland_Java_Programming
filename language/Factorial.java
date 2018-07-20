package assignments.language;

public class Factorial {

	public static void main(String args[]) {
    
        // calculates factorial of 10
        int value = 10, factorial_result = 1;
        while (value > 0) {
            factorial_result *= value;
            value--;
        }
        System.out.println(factorial_result);
        
    }
	
}
