package assignments.abstractinterfaces;

import java.util.Arrays;

public class SortedIntList extends DataStructure {
	
	private int capacity;
	private int data [];
	
	public SortedIntList(int capacity) {
		this.capacity = capacity;
		data = new int[capacity];
	}
	
    public boolean addElement(int element) {
    	if (this.size < capacity) {
    		data[this.size] = element;
    		this.size++;
            Arrays.sort(data, 0, size);
    		return true;
    	}
    	else { return false; }
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < size; i++){
            sb.append(data[i]);
            if(i < size -1)
                sb.append(", ");
        }
        return sb.toString();
    }
	
}
