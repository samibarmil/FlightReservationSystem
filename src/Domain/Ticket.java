package Domain;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

import DataAccess.DataModel;

public class Ticket {

	private final String id;
	private final String ticketNumber; // 20 digits random
	private FlightInstance specificFlight;
	// To make sure that the generated random number wasn't used before
	private ArrayList<String> randomNumbersInUse = new ArrayList<>();

	public Ticket(FlightInstance flight) {
		this.id = UUID.randomUUID().toString();
		this.ticketNumber = randomNumeric();
		this.specificFlight = flight;
		DataModel.ticketDataModel.addEntity(this);
	}

	// A unique 20 digits random will be generated here
	private String randomNumeric() {
		String numeralsSet = "1234567890";
		StringBuilder randomValue = new StringBuilder();
		Random rnd = new Random();
		while (randomValue.length() < 20) { // length of the random string
			int index = (int) (rnd.nextFloat() * numeralsSet.length());
			randomValue.append(numeralsSet.charAt(index));
		}
		while (true) {
			if (!randomNumbersInUse.contains(randomValue.toString())) {
				randomNumbersInUse.add(randomValue.toString());
				break;
			}
			randomNumeric();
		}

		return randomValue.toString();

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
