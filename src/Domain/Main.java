package Domain;

import java.util.Random;
import java.util.UUID;

public class Main {

	private static String randomAlphaNumeric() {
		String alphaNumericSet = "1234567890";
		StringBuilder randomValue = new StringBuilder();
		Random rnd = new Random();
		while (randomValue.length() < 20) { // length of the random string.
			int index = (int) (rnd.nextFloat() * 10);
			randomValue.append(alphaNumericSet.charAt(index));
		}
		return randomValue.toString();

	}
	public static void main(String args[]) {
//
//		try {
//		System.out.println(UUID.randomUUID().toString());
//		System.out.println(Flight.getRandomNumber());	
//		System.out.println(Flight.getRandomNumber());	
//		System.out.println(Flight.getRandomNumber());	
//		System.out.println(Flight.getRandomNumber());	
//		}
//		catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		System.out.println(randomAlphaNumeric());

		// System.out.println(getSaltString());
	}

}
