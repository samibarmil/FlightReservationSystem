package business;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import DataAccess.DataModel;
import Domain.*;

public class Main {

	private static String randomAlphaNumeric() {
		String alphaNumericSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder randomValue = new StringBuilder();
		Random rnd = new Random();
		while (randomValue.length() < 6) { // length of the random string
			int index = (int) (rnd.nextFloat() * alphaNumericSet.length());
			randomValue.append(alphaNumericSet.charAt(index));
		}

		return randomValue.toString();

	}

	private static String StringRand(int num) {
		String alphaNumericSet = "ABCD";
		StringBuilder randomValue = new StringBuilder();
		Random rnd = new Random();
		while (randomValue.length() < num) { // length of the random string
			int index = (int) (rnd.nextFloat() * alphaNumericSet.length());
			randomValue.append(alphaNumericSet.charAt(index));
		}
		return randomValue.toString();

	}

	public static void generatePassengers() {
		for (int i = 0; i < 50; i++) {
			new Passenger(randomAlphaNumeric(), randomAlphaNumeric(), randomAlphaNumeric(), LocalDate.now());
		}
	}

	public static void generateAgents() {
		for (int i = 0; i < 50; i++) {
			new Agent(randomAlphaNumeric(), randomAlphaNumeric(), randomAlphaNumeric(), LocalDate.now());
		}
	}

	public static void generateAirports() {
		for (int i = 0; i < 100; i++) {
			try {
				new Airport(StringRand(3), StringRand(10),
						new Address(StringRand(9), StringRand(9), StringRand(9), StringRand(9)));
			} catch (UserException e) {
				System.err.println(e);
			}
		}
	}

	public static void generateAirlines() {
		Random rand = new Random();

		for (int i = 0; i < 30; i++) {
			Airline airline = new Airline(StringRand(3), StringRand(3), StringRand(100));
			System.out.println(airline.getCode() + ":");
			for (int j = 0; j < 70; j++) {
				Flight flight;
				try {
					flight = (new Flight(rand.nextInt(100), LocalTime.now(), LocalTime.now(),
							DataModel.airportDataModel.getall().get(rand.nextInt(100)),
							DataModel.airportDataModel.getall().get(rand.nextInt(100))));

					for (int z = 0; z < 90; z++) {
						flight.createFlightInstance(new FlightInstance(LocalDate.now()));
					}
					airline.createFlight(flight);
					// System.out.println(flight);

				} catch (UserException e) {
					System.err.println(e);
				}

			}
		}
	}

	static void generateReservations() {
		Random rand = new Random();
		for (Passenger passenger : DataModel.passengerDataModel.getall()) {

			for (int i = 0; i < 50; i++) {
				List<FlightInstance> fi = new ArrayList<>();
				fi.add(DataModel.flightDataModel.getall().get(rand.nextInt(70)).getFlightInstances()
						.get(rand.nextInt(90)));
				fi.add(DataModel.flightDataModel.getall().get(rand.nextInt(70)).getFlightInstances()
						.get(rand.nextInt(90)));
				fi.add(DataModel.flightDataModel.getall().get(rand.nextInt(70)).getFlightInstances()
						.get(rand.nextInt(90)));
				passenger.CreateReservation(fi);
			}
		}
	}

	public static void main(String[] args) {
		generatePassengers();
		generateAirports();
		generateAirlines();
		generateReservations();

		Random rand = new Random();

		System.out.println("################################################################");
		AirLineBusiness.airlinesFlyingOutFromSpecificAirport("AAC");

		List<FlightInstance> fi = new ArrayList<>();
		fi.add(DataModel.flightDataModel.getall().get(rand.nextInt(70)).getFlightInstances().get(rand.nextInt(90)));
		fi.add(DataModel.flightDataModel.getall().get(rand.nextInt(70)).getFlightInstances().get(rand.nextInt(90)));
		fi.add(DataModel.flightDataModel.getall().get(rand.nextInt(70)).getFlightInstances().get(rand.nextInt(90)));

		ReservationBusiness.CreateReservation(DataModel.passengerDataModel.getall().get(rand.nextInt(50)), fi);

		Passenger psgr = DataModel.passengerDataModel.getall().get(rand.nextInt(50));
		ReservationBusiness.ViewSpecificReservation(psgr, psgr.ViewAllReservations().get(rand.nextInt(50)).getId());

	}

}
