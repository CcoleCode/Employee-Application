/*
 * Author: Chelsea Cole
 * Date: March 04, 2022
 * Description: The Intern class inherits from Employee
 */


public class Intern extends Employee {
	
	private int hoursPerWeek;
	private String university;
	private boolean isPaid; //nextBoolean
	
	
	public Intern(String name, double salary, String ssn, int hoursPerWeek, String university,
			boolean isPaid) {
		super(name, salary, ssn);
		this.hoursPerWeek = hoursPerWeek;
		this.university = university;
		this.isPaid = isPaid;
	}


	public String getUniversity() {
		return university;
	}


	public void setUniversity(String university) {
		this.university = university;
	}
	
	@Override 
	public double getPay(){
		
		if (this.isPaid == true) {	
			return  this.salary * this.hoursPerWeek * 2;
		} else {
			return 0.0;
		}
	}

}




