package assignments.language;

public class SumOddIntegers {
	
    public static void main(String args[]) {
    	
        int sum_value = 0;
        // loop
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                sum_value += i;
            }
        }
        // output results
        System.out.println(sum_value);
        
    }
    
}
