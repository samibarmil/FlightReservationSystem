package Domain;

import java.time.LocalDate;
import java.util.UUID;

public class FlightInstance {

	private final String id;
	private LocalDate flightInstanceDate;

	public FlightInstance(LocalDate flightDate) {
		this.id = UUID.randomUUID().toString();
		this.flightInstanceDate = flightDate;
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
