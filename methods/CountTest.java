package assignments.methods;

public class CountTest {
	
	public static void main(String[] args) {
		
		String test = "Test123 String ";
		System.out.println( assignments.methods.Count.digits(test) );
		System.out.println( assignments.methods.Count.whitesapce(test) );

		StringBuffer test2 = new StringBuffer();
		test2.append("Test123 String ");
		System.out.println( assignments.methods.Count.digits(test2) );
		System.out.println( assignments.methods.Count.whitespace(test2) );
		
	}

} 
