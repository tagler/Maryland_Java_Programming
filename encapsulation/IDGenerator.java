package assignments.encapsulation;

public class IDGenerator {
	
	// data
	private String prefix;
	private int counter;
	
	// construct
	public IDGenerator(String prefix, int startValue) {
		this.prefix = prefix;
		this.counter = startValue;
	}
	public IDGenerator(String prefix) {
		this(prefix, 0);
	}	
	public IDGenerator() {
		this("emp", 0);
	}
		
	// methods
	public String issueNext() {
		counter++;
		return this.prefix + this.counter;
	}
    public String viewNext(){
        return prefix + counter;
    }
    
}
