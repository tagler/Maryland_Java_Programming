package assignments.inheritance;

public class Appointment extends SimpleDate {

	// data
	String place;
	String namePerson;
	
	//construct 
	public Appointment(int m, int d, int y, String p, String name) {
		super(m, d, y);
		this.place = p;
		this.namePerson = name;
	}	
	public Appointment(int m, int d, String p, String name) {
		super(m, d);
		this.place = p;
		this.namePerson = name;
	}	
	
	// methods
	public String toString() {
		return super.toString() + " Appointment with " + this.namePerson + " at " + this.place;
	}
}
