package assignments.encapsulation;

public class EmployeeTester{
	
    public static void main(String args[]){
    	
        Employee e1 = new Employee("Michael", new SimpleDate());
        Employee e2 = new Employee("Michael", new SimpleDate(1, 1, 2004));
        Employee e3 = new Employee("Michael", new SimpleDate(7, 4, 2005));
        
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

    }
    
}