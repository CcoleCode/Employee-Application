/*
 * Author: Chelsea Cole
 * Date: March 04, 2022
 * Description: The FullTime class inherits from Employee
 */


public class FullTime extends Employee {

	public FullTime(String name, double salary, String ssn) {
		super(name, salary, ssn);
		
	}
		
		double calculateBonus() {
			
			return (this.salary * .15);
		}
		
		@Override 
		public double getPay() {
			
			 return (this.salary / 26);
			
		}	
}
