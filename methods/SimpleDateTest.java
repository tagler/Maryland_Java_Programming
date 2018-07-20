package assignments.methods;

import assignments.methods.SimpleDate;

public class SimpleDateTest {
	
	public static void main(String[] args) {
		
    	// test construct  
    	SimpleDate test1 = new SimpleDate(12, 31, 2004);
    	SimpleDate test2 = new SimpleDate(10, 31);
    	SimpleDate test3 = new SimpleDate(15);
    	SimpleDate test4 = new SimpleDate();
    	SimpleDate test5 = new SimpleDate("12/31/1958");
    	
    	// test gets
    	System.out.println( test1.getDay() );
    	System.out.println( test1.getMonth() );
    	System.out.println( test1.getYear() );
    	System.out.println( test2.getDay() );
    	System.out.println( test2.getMonth() );
    	System.out.println( test2.getYear() );
    	System.out.println( test3.getDay() );
    	System.out.println( test3.getMonth() );
    	System.out.println( test3.getYear() );
    	System.out.println( test4.getDay() );
    	System.out.println( test4.getMonth() );
    	System.out.println( test4.getYear() );    
    	System.out.println( test5.getDay() );
    	System.out.println( test5.getMonth() );
    	System.out.println( test5.getYear() );  
    	// test sets
    	test1.setDay(14);
    	test1.setMonth(4);   
    	test1.setYear(1954);   
    	
    	// test print as string 
    	System.out.println( test1.toString() );    	
    	System.out.println( test2.toString() );    	
    	System.out.println( test3.toString() );    	
    	System.out.println( test4.toString() );    	
    	System.out.println( test5.toString() );    
    }
}
    	