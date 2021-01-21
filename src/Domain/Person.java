package Domain;

import java.time.LocalDate;
import java.util.UUID;

public abstract class Person {

	private final String id;
	private String fName;
	private String lName;
	private String eMail;
	private LocalDate DOB;

	public Person(String fName, String lName, String eMail, LocalDate DOB) {
		this.id = UUID.randomUUID().toString();
		this.fName = fName;
		this.lName = lName;
		this.eMail = eMail;
		this.DOB = DOB;
	}

	public String getId() {
		return id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

}
