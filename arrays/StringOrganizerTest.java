package assignments.arrays;

public class StringOrganizerTest {

	public static void main(String[] args) {
		
		String array[] = {"string1","string3","string2","string4","string5"};
		StringOrganizer test = new StringOrganizer(array);
		
		System.out.println( "index test: " + test.getString(2) );
		System.out.println( "string print test: " + test.toString() );
		
		test.reverse();
		System.out.println( "reverse test: " + test.toString() );
		test.ascendingSort();
		System.out.println( "ascending sort test: " + test.toString() );
		test.decendingSort();
		System.out.println( "decending sort test: " + test.toString() );
		
	}

}
