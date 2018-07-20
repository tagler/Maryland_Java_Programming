package assignments.encapsulation;

public class Employee {
	
    // instance data
    private String name;
    private String id;
    private SimpleDate hireDate;

    // static data
    private static IDGenerator idg = new IDGenerator("emp", 0);

    // constructors
    public Employee (String name, SimpleDate hd){
        this.name = name;
        this.hireDate = hd;
        this.id = idg.issueNext();
    }

    // methods
    public String getName() {
        return this.name;
    }

    public String getID() {
        return this.id;
    }

    public SimpleDate getHireDate() {
        return this.hireDate;
    }

    public String toString() {
        return "Name: " + this.name + ", ID: " + this.id + ", HD: " + this.hireDate + "\n";
    }
}