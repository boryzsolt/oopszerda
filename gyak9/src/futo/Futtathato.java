package futo;

import sajat.*;
import java.util.Scanner;

public class Futtathato {

	public static void main(String[] args) {
		System.out.println("Kerem a hengerek adattait!");
		Scanner s = new Scanner(System.in);
		int magassag=s.nextInt();
		s.nextLine();
		int sugar=s.nextInt();
		
		Henger henger = new Henger(magassag, sugar);
		
		System.out.println(henger);
		
		
		
		
		
		
		
		
		
		
	}

}
