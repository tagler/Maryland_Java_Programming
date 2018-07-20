package assignments.arrays;

import java.util.Arrays;

public class StringOrganizer {

	// data
	String data [];
	
	// construct
	public StringOrganizer(String [] args) {
		data = args;
	}
	
	// methods 
	public void reverse() {
		String dataTemp[] = new String[data.length];
		for (int i = 0 ; i < data.length ; i++) {
			dataTemp[data.length-1-i] = data[i];
		}
		data = dataTemp;
		
	}
	public void ascendingSort() {
		Arrays.sort(data);
	}
	public void decendingSort() {
		ascendingSort();
		reverse();
	}
	public String getString(int index){
		return data[index];
	}
	public String toString() {
		String outputString = "Array String Print: ";
		for (String eachString : data) {
			outputString += (eachString + " ");
		}
		return outputString;
	}
}
