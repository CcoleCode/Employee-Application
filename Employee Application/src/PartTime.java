/*
 * Author: Chelsea Cole
 * Date: March 04, 2022
 * Description: The Parttime class inherits from Employee
 */


public class PartTime extends Employee {
	
	private int hoursPerWeek;

	public PartTime(String name, double salary, String ssn) {
		super(name, salary, ssn);
		
		
		
	}

	public PartTime(String name, double salary, String ssn, int hoursPerWeek) {
		super(name, salary, ssn);
		this.hoursPerWeek = hoursPerWeek;
	}

	
	@Override 
	public double getPay(){
		
		return (this.salary * hoursPerWeek * 2);
	}
}

