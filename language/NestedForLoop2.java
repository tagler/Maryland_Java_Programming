package assignments.language;

public class NestedForLoop2 {
	
    public static void main(String args[]) {
    
        // loop
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    System.out.println(i-j+1 + " ");
                }
                else {
                    System.out.print(i-j+1 + " ");
                }
            }
        }
        
    }
    
}
