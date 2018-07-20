package assignments.exceptions;

public class RaiseWithHandler {
	
	public static void main(String[] args) {
		a(args);
	}
	
	public static void a(String args[]){ 
		
		try {
			b(args);
		} 
		finally {
		System.out.println("After call to b()");
		}
		
	}
	
    public static void b(String args[]) {
    	
        try {
        	int x = Integer.parseInt(args[0]);
        } 
        catch(NumberFormatException e) {
        System.out.println(e);
        } 
        finally {
        	System.out.println("Inside of finally"); 
        }
        
        System.out.println("Finished with handlers");
    }
    
}