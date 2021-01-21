package Domain;

import java.time.LocalDate;
import java.util.UUID;

import DataAccess.DataModel;

public class FlightInstance {

	private final String id;
	private LocalDate flightInstanceDate;

	public FlightInstance(LocalDate flightDate) {
		this.id = UUID.randomUUID().toString();
		this.flightInstanceDate = flightDate;
		
		DataModel.flightInstanceDataModel.addEntity(this);
	}

	public String getId() {
		return id;
	}

	public LocalDate getFlightInstanceDate() {
		return flightInstanceDate;
	}

	public void setFlightInstanceDate(LocalDate flightInstanceDate) {
		this.flightInstanceDate = flightInstanceDate;
	}

}
