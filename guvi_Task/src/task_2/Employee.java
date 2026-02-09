package task_2;

class Employee extends Person {

    private int employeeID;
    private double salary;

    // Constructor using super
    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age);   // Initialize Person attributes
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployee() {
        getDetails();  // Call parent method
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }

    // Main method to test
    public static void main(String[] args) {

        Employee emp = new Employee("Sourav", 25, 101, 50000);

        emp.displayEmployee();
    }
}

