package assignments.ooprogramming;

public class PadTest {
	
    public static void main(String args[]) {
    	
    	PaddedString test = new PaddedString("this is a test");
    	PaddedString test2 = new PaddedString("this is a test");
    	PaddedString test3 = new PaddedString("    this is a test    ");
    	
    	System.out.println( test.toString() );
    	System.out.println( test.length() );
    	
    	test.padLeft(30);
    	System.out.println( test.toString() );

    	test2.padRight(30);
    	System.out.println( test2.toString() );
    	
    	System.out.println( test3.toString() );
    	test3.trimBlanks();
    	System.out.println( test3.toString() );

    }
    
}