package assignments.language;

public class NestedForLoop {
	
    public static void main(String args[]) {
    
        // loop
        for (int i = 7; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    System.out.println(j + " ");
                }
                else {
                    System.out.print(j + " ");
                }
            }
        }
        
    }
    
}
