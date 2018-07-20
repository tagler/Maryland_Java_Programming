package assignments.ooprogramming;

public class PersonTest {
	
    public static void main(String args[]) {

        Person firstPerson = new Person("john","doe",21);
        System.out.println(firstPerson.getFirstName());
        System.out.println(firstPerson.getLastName());
        System.out.println(firstPerson.getFullName());
        System.out.println(firstPerson.getPersonAge());
        System.out.println(firstPerson.toString()); 
    	
        System.out.println(""); 
        
        Person secondPerson = new Person("jimmy doe",12);
        System.out.println(secondPerson.getFirstName());
        System.out.println(secondPerson.getLastName());
        System.out.println(secondPerson.getFullName());
        System.out.println(secondPerson.getPersonAge());
        System.out.println(secondPerson.toString());
        
    }
    
}