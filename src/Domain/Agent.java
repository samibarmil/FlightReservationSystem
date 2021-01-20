package Domain;




import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agent extends Person {

	// inheritance relation of a supper class Person and sub class agent
	// same attributes
	// id, firstName, lastName, email, dateOfbirth, address
	// a minimum of one agent for 0 or many reservations

	private List<Reservation> reservations = new ArrayList<Reservation>();
	public Agent(String id ,String firstname,String lastName,
			String email,LocalDate dob,Address address) {
		super(id,firstname,lastName,email,dob ,address );
	}
	public List<Reservation>getReservations(){
		return reservations;
	}
	public void addReservation(Reservation reservation) {
		reservations.add(reservation);
	}
	
}
