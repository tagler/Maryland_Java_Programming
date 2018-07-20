package assignments.abstractinterfaces;

public class DataStructureTest {
	
    public static void main(String args[]){
    	
        DataStructure myData = new SortedIntList(args.length);
        
        int x;
        for(int i = 0; i < args.length; i++){
            x = Integer.parseInt(args[i]);
            myData.addElement(x);
        }
        
        System.out.println("Size = " + myData.size());
        System.out.println(myData);
    }
    
}