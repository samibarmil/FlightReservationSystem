package Domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import DataAccess.DataModel;

public class Reservation {

	private final String id;
	private final String reservationCode; // It must be 6 character alphanumeric
	private List<Ticket> tickets;
	// To make sure that the generated random alphanumeric wasn't used before
	public ArrayList<String> randomNumbersInUse = new ArrayList<>();

	public Reservation() {
		this.id = UUID.randomUUID().toString();
		this.reservationCode = randomAlphaNumeric();
		tickets = new ArrayList<>();
		DataModel.reservationDataModel.addEntity(this);
	}

	// A unique alphanumeric is generated here
	public String randomAlphaNumeric() {
		String alphaNumericSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder randomValue = new StringBuilder();
		Random rnd = new Random();
		while (randomValue.length() < 6) { // length of the random string
			int index = (int) (rnd.nextFloat() * alphaNumericSet.length());
			randomValue.append(alphaNumericSet.charAt(index));
		}
		while (true) {
			if (!randomNumbersInUse.contains(randomValue.toString())) {
				randomNumbersInUse.add(randomValue.toString());
				break;
			}
			randomAlphaNumeric();
		}

		return randomValue.toString();

	}

	public String getId() {
		return id;
	}

	public String getReservationCode() {
		return reservationCode;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

}
