package assignments.language;

public class TableSquaresCubes {
	
    public static void main(String args[]) {
    
        for (int i=20; i <= 60; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
                System.out.print(" ");
                System.out.print(i*i);
                System.out.print(" ");
                System.out.println(i*i*i);
            }
        }
        
    }
    
}
