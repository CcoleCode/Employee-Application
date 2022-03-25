/*Author: Chelsea Cole
 * Date: March 03, 2022
 * Description: : In this assignment, you will be implementing an employee application 
using inheritance.
 */


public abstract class Employee {
	
	protected String name;
	protected double salary;
	protected String ssn;
	final int employeeID;
	
	public static int nextId = 1;

	public Employee(String name, double salary, String ssn) {
		super();
		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
		this.employeeID = nextId++;
	}
	
	public int getEmployeeId() {
		return employeeID;
	}
	
	public abstract double getPay(); 
		

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", ssn=" + ssn + ", employeeID=" + employeeID
				+ ", nextId=" + nextId + "]";
	}
}
