package Domain;

import java.util.Random;
import java.util.UUID;

import DataAccess.DataModel;

public class Ticket {

	private final String id;
	private final String ticketNumber; // 20 digits random
	private FlightInstance specificFlight;

	public Ticket(FlightInstance flight) {
		this.id = UUID.randomUUID().toString();
		this.ticketNumber = UUID.randomUUID().toString();
		this.specificFlight = flight;
		DataModel.ticketDataModel.addEntity(this);
	}

	public String getId() {
		return id;
	}

	public String getTicketNumber() {
		return ticketNumber;
	}

	public FlightInstance getSpecificFlight() {
		return specificFlight;
	}

	public void setSpecificFlight(FlightInstance specificFlight) {
		this.specificFlight = specificFlight;
	}

}
