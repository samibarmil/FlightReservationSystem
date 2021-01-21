package Domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Reservation {

	private final String id;
	private final String reservationCode; // 6 character alphanumeric
	private List<Ticket> tickets;

	public Reservation() {
		this.id = UUID.randomUUID().toString();
		this.reservationCode = randomAlphaNumeric(6);
		tickets = new ArrayList<>();
	}

	private String randomAlphaNumeric(int alphaNumericLength) {
		String alphaNumericSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder randomValue = new StringBuilder();
		Random rnd = new Random();
		while (randomValue.length() < alphaNumericLength) { // length of the random string.
			int index = (int) (rnd.nextFloat() * alphaNumericSet.length());
			randomValue.append(alphaNumericSet.charAt(index));
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
