package assignments.inheritance;

public class Planner{
	
	// data
    private SimpleDate sd [];
    private int capacity;
    private int size;

    // construct
    public Planner(int capacity){
        this.capacity = capacity;
        this.size = 0;
        sd = new SimpleDate[capacity];
    }

    // methods
    public int getCapacity(){
        return this.capacity;
    }

    public int getSize(){
        return this.size;
    }

    public void addDate(SimpleDate d){
    	if (this.size < this.capacity) {
    		sd[size] = d;
    		this.size++;
    	}
    	else {
    		System.out.println("planner is full, unable to add");
    	}
    }

    public String toString(){
        String outputString = "Planner:\n";
        for (int i = 0 ; i < this.size ; i++) {
        	outputString = outputString + sd[i].toString() + "\n";
        }
        return outputString;
    }

    public Appointment [] getAppointments(){
        Appointment a [] = new Appointment [size];
        int count = 0;
        for(int i = 0; i < size; i++){
            if(sd[i] instanceof Appointment){
                a[count] = (Appointment) sd[i];
                count++;
            }
        }
        Appointment result [] = new Appointment[count];
        System.arraycopy(a, 0, result, 0, count);
        return result;
    }

    public Holiday [] getHolidays(){
        Holiday a [] = new Holiday [size];
        int count = 0;
        for(int i = 0; i < size; i++){
            if(sd[i] instanceof Holiday){
                a[count] = (Holiday) sd[i];
                count++;
            }
        }
        Holiday result [] = new Holiday[count];
        System.arraycopy(a, 0, result, 0, count);
        return result;
    }
    
}