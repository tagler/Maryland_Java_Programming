package assignments.language;

public class AddStatementsForLoop {
	
    public static void main(String args[]) {
    
        for (int i=-4; i <= 4; i++) {
            // zero case
            if (i == 0) {
                System.out.println(i + " is even");
                }
            // even
            else if (i % 2 == 0) {
                // positive
                if (i > 0) {
                    System.out.println(i + " is positive and even");
                }
                // negative
                else {
                    System.out.println(i +  " is negative and even");
                }
            }
            // odd
            else {
                // positive
                if (i > 0) {
                    System.out.println(i + " is positive and odd");
                }
                // negative 
                else {
                    System.out.println(i + " is negative and odd");
                }
            }
        }
        
    }
    
}
