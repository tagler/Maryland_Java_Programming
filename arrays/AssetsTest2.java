package assignments.arrays;

public class AssetsTest2 {
	
    public static void main(String args[]) {
        
    	Assets things = new Assets(2);
        things.addElement("Car", 25000.00);
        things.addElement("Boat", 50000.00);
        things.addElement("Stereo", 1000.00);
        
        System.out.println("ITEMS ARE:\n" + things);
        System.out.println("WORTH IS:  " + things.getTotalValue());
        
        System.out.println(things.getItem(1));
        System.out.println(things.getItem(4));
        System.out.println(things.getItem(2));
        
        System.out.println("SIZE: " + things.size());
        System.out.println("CAPACITY: " + things.capacity());
    
    }
    
}