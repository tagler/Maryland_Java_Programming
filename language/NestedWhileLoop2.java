package assignments.language;

public class NestedWhileLoop2 {
	
    public static void main(String args[]) {
    
        // loop
        int i = 7;
        while (i >= 0) {
            int j = 1;
            while (j <= i) {
                if (i == j) {
                    System.out.println(j + " ");
                }
                else {
                    System.out.print(j + " ");
                }
            j++;
            }
        i--;
        }
        
    }
    
}
