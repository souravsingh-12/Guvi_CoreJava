package task_2;

public class Person {
	//Main method
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.getDetails();
		
		System.out.println("---------------");
		
		Person p2 = new Person("Sourav", 25);
		p2.getDetails();

	}
	
	// Properties
	String name;
	private int age  = 18; //default age
	
	//Default constructor
	public Person() {
		// default age is 18
	}
	
	//Parameterized constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age; 
	}
	
	//Method to display details
	public void getDetails() {
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
	}
}
