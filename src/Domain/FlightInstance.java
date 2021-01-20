package Domain;

<<<<<<< Updated upstream
public class FlightInstance {
=======
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class FlightInstance {
	
	//FlightInstance Has-A flight
	//FlightInstance Has-A LocalDate
	private Flight flight;
	private LocalDate date;
	
	//FlightInstance has many Crew
	//FlightInstance has many Pilots
	//FlightInstance has many Reservations
	//FlightInstance has many Tickets
	
	private List<Crew>crew = new ArrayList<Crew>();
	private List<Pilot>pilots = new ArrayList<Pilot>();
	private List<Reservation>reservations = new ArrayList<Reservation>();
	private List<Ticket>ticket = new ArrayList<Ticket>();
>>>>>>> Stashed changes

}
