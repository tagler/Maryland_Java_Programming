package assignments.ooprogramming;

public class Person {
	
	// data
	String firstName;
	String lastName;
	int personAge;
	
	// construct  
	public Person(String first, String last, int age) {
		this.firstName = first;
		this.lastName = last;
		this.personAge = age;
	}
	public Person(String fullName, int age) {
		// split fullname into first and last names 
		int spaceIndex;
		spaceIndex = fullName.indexOf(' ');
		this.firstName = fullName.substring(0,spaceIndex);
		this.lastName = fullName.substring(spaceIndex+1);
		this.personAge = age;
	}

	// methods
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}

	public int getPersonAge() {
		return personAge;
	}
	public String toString() {
		return "Name: " + firstName + " " + lastName + " Age: " + personAge;
	}
	
}