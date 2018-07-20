package assignments.exceptions;

public class BadMonthException extends RuntimeException {
		
	    private int badMonth;
	    
	    public BadMonthException(String msg, int badMonth){
	        super(msg);
	        this.badMonth = badMonth;
	    }
	    
	    public int getBadMonth(){
	        return badMonth;
	    }
	    
	    public String toString(){
	        return super.toString() + ":" + badMonth;
	    }
	    
}
