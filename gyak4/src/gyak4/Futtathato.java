package gyak4;

import java.util.Scanner;
import java.util.Random;

public class Futtathato {

	public static void main(String[] args) {
		// int meret=5;
		Scanner beolvasas = new Scanner(System.in);
		System.out.println("meret:");
		int meret = beolvasas.nextInt();
		Alkalmazott alkalmazottak[] = new Alkalmazott[meret];
		Random veletlenszam = new Random();
		for (int i = 0; i < alkalmazottak.length; i++) {
			alkalmazottak[i] = new Alkalmazott("xy", 25);
			System.out.println(alkalmazottak[i]);
		}

	}

}
