package assignments.inheritance;

public class Holiday extends SimpleDate {

	// data
	String holidayName;
	
	//construct 
	public Holiday(int m, int d, int y, String name) {
		super(m, d, y);
		this.holidayName = name;
	}
	public Holiday(int m, int d, String name) {
		super(m, d);
		this.holidayName = name;
	}
	
	public String toString() {
		return super.toString() + " Holiday: " + this.holidayName;
	}
}
