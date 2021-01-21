package Domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Passenger extends Person {

	private List<Reservation> reservations;

	public Passenger(String fName, String lName, String eMail, LocalDate DOB) {
		super(fName, lName, eMail, DOB);
		this.reservations = new ArrayList<>();
	}

	public List<Reservation> ViewAllReservations() {
		return reservations;
	}
	
	

}
