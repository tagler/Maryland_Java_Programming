package assignments.arrays;

public class AssetsTest {

	public static void main(String[] args) {
		
		Assets test = new Assets(5);
		test.addElement("car",20000);
		test.addElement("boat",50000);
		test.addElement("house",1000000);
		test.addElement("house2",20000000);
		test.addElement("house3",50000000);
		test.addElement("guitar",500);
		
		System.out.println( test.size() );
		System.out.println( test.capacity() );
		System.out.println( test.getItem(2) );
		System.out.println( test.toString() );
		System.out.println( "Total Asset Value: $" + test.getTotalValue() );
	}

}
