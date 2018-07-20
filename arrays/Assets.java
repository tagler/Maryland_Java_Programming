package assignments.arrays;

public class Assets {
	
	// data
	String names[];
	double values[];
	int size = 0;
	int capacity;
	
	// construct 
	public Assets(int maxSize) { 
		this.capacity = maxSize; 
		this.names = new String[capacity];
		this.values = new double[capacity];
	}
	
	// methods
	public void addElement(String item, double itemVal) {
		
		if (this.size == this.capacity) {
			// increase capacity
			System.out.println("increasing capacity...");
			this.capacity += 5;
			String tempNames[] = new String[capacity];
			double tempValues[] = new double[capacity];
			System.arraycopy(names, 0, tempNames, 0, this.size);
			System.arraycopy(values, 0, tempValues, 0, this.size);	
			names = tempNames;
			values = tempValues;
		}
		
		// add item
		this.names[size] = item;
		this.values[size] = itemVal;
		System.out.println("added item!");
		this.size++; 
	}
	
	public int size() {
		return this.size;
	}
	
	public int capacity() {
		return this.capacity;
	}
	
	public String getItem(int whichItem) {
		if (whichItem > this.size - 1) {
			return "no item at this index, please try again";
		}
		return "Name: " + this.names[whichItem] + ", Value: $" + this.values[whichItem];
	}
	
	// returns string that is formatted as a table
	public String toString() {
		String outputString = "\nName\tValue\n";
		for (int i = 0 ; i < this.size ; i++) {
			outputString += this.names[i] + "\t$" + this.values[i] + "\n";
		}
		return outputString;
	}
	
	// sum of all values
	public double getTotalValue() {
		double totalValueSum = 0;
		for (double eachValue : values) {
			totalValueSum += eachValue;
		}
		return totalValueSum;
	}
	
}
