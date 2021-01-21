package Domain;

import java.time.LocalDate;

public class Pilot extends Person {

	private double salary;

	public Pilot(String fName, String lName, String eMail, LocalDate DOB, double salary) {
		super(fName, lName, eMail, DOB);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
