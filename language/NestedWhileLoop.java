package assignments.language;

public class NestedWhileLoop {
	
    public static void main(String args[]) {
    
        // loop
        int i = 1;
        while (i <= 7) {
            int j = 1;
            while (j <= i) {
                if (i == j) {
                    System.out.println(i-j+1 + " ");
                }
                else {
                    System.out.print(i-j+1 + " ");
                }
            j++;
            }
        i++;
        }
        
    }
    
}
