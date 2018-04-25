package sajat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.InvalidMarkException;
import java.time.LocalDate;

public class Proba3 {
	public static void main(String[] args) {
		InputStreamReader instream = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(instream);
		try {
			System.out.println("Tantárgy: ");
			String subject = input.readLine();
			LocalDate date = LocalDate.now();
			boolean invalidmark = true;
			do {
				System.out.println("Érdemjegy: ");
				String markstr = input.readLine();
				try {
					int mark = Integer.parseInt(markstr);
					invalidmark = false;
				} catch (NumberFormatException ex) {
					System.out.println("Not a number...");
				} catch (InvalidMarkException ex) {
					System.out.println("Mark is valid between 1 and 5");
				}
			} while (invalidmark);
		} catch (IOException io) {
			io.printStackTrace();
		}
	}
}