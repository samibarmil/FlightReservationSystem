package Domain;

<<<<<<< Updated upstream
public class Passenger {
=======
import java.util.ArrayList;
import java.util.List;

public class Passenger extends Person {

	// a passenger IS-A Person
	// one passenger for many Tickets
	// one passenger for a List of Reservation

	private List<Reservation> reservations = new ArrayList<Reservation>();
	private List<Ticket> tickets = new ArrayList<Ticket>();
>>>>>>> Stashed changes

}
