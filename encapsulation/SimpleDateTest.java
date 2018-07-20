package assignments.encapsulation;

public class SimpleDateTest {
	
    public static void main(String args[]) {
    	
    	// test construct  
    	SimpleDate test1 = new SimpleDate(12, 31, 2004);
    	SimpleDate test2 = new SimpleDate(10, 31);
    	SimpleDate test3 = new SimpleDate(15);
    	SimpleDate test4 = new SimpleDate();
    	
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
    	
    	// test sets
    	test1.setDay(14);
    	test1.setMonth(4);   
    	test1.setYear(1954);   
    	
    	// test print as string 
    	System.out.println( test1.toString() );    	
    	System.out.println( test2.toString() );    	
    	System.out.println( test3.toString() );    	
    	System.out.println( test4.toString() );    	
    	
    	SimpleDate dates [] = {
    		    new SimpleDate(2, 3, 2008),   
    		    new SimpleDate(2, 3, 2011),  
    		    new SimpleDate(3, 2, 2008),  
    		    new SimpleDate(3, 2, 2011),   
    		    new SimpleDate(12, 30, 2008), 
    		    new SimpleDate(12, 30, 2011) };
    	
    	for(int i = 0; i < dates.length; i++){
                System.out.println(dates[i]);
                System.out.println("Month:     " + dates[i].getMonthAsString());
                System.out.println("DayOfYear: " + dates[i].getDayOfYear());
                System.out.println("DaysLeft:  " + dates[i].getDaysLeftInYear());
                System.out.println("Leap Year: " + dates[i].isLeapYear());
                System.out.println(); 
                }

    }
    
}
    	