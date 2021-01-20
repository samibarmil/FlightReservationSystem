package Domain;




import java.util.ArrayList;
import java.util.List;

public class Agent extends Person {

	// inheritance relation of a supper class Person and sub class agent
	// same attributes
	// id, firstName, lastName, email, dateOfbirth, address
	// a minimum of one agent for 0 or many reservations

	private List<Reservation> reservations = new ArrayList<Reservation>();

}
