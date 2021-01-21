package business;

import java.util.List;

import Domain.*;

public final class ReservationBusiness {

	private ReservationBusiness() {
	}

	public static void ViewReservation(Person person, String Id) {
		if (person instanceof Passenger) {
			Passenger passenger = (Passenger) person;
			for (Reservation reservation : passenger.ViewAllReservations())
				if (reservation.getId() == Id) {
					System.out.println(reservation);
				}

		}

		if (person instanceof Agent) {
			Agent agent = (Agent) person;
			for (Reservation reservation : agent.ViewAllReservations())
				if (reservation.getId() == Id) {
					System.out.println(reservation);
				}
		}
	}

	public static void ViewReservations(Person person) {

		if (person instanceof Passenger) {
			Passenger psngr = (Passenger) person;

			for (Reservation rsvn : psngr.ViewAllReservations()) {
				System.out.println(rsvn);
			}
		}

		if (person instanceof Agent) {
			Passenger agnt = (Passenger) person;

			for (Reservation rsvn : agnt.ViewAllReservations()) {
				System.out.println(rsvn);
			}
		}

	}

	public static void CreateReservation(Person person, List<FlightInstance> flights) {

		if (person instanceof Passenger) {
			Passenger passenger = (Passenger) person;
			passenger.CreateReservation(flights);
		}

		if (person instanceof Agent) {
			Agent passenger = (Agent) person;
			passenger.CreateReservation(flights);
		}
	}

	public static void RemoveReservation(Person person, String Id) {
		if (person instanceof Passenger) {
			Passenger passenger = (Passenger) person;
			passenger.RemoveReservation(Id);
		}

		if (person instanceof Agent) {
			Agent passenger = (Agent) person;
			passenger.RemoveReservation(Id);
		}
	}
}
