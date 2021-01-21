package Domain;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Ticket {

	private final String id;
	private final String ticketNumber; // 20 digits random
	private FlightInstance specificFlight;
	// To make sure that the generated random number wasn't used before
	public static ArrayList<String> randomNumbersInUse = new ArrayList<>();

	public Ticket(FlightInstance flight) {
		this.id = UUID.randomUUID().toString();
		this.ticketNumber = UUID.randomUUID().toString();
		this.specificFlight = flight;
	}

	// A unique 20 digits random will be generated here
	public static String randomNumeric() {
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
