package sajat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Proba4 {

	public static void main(String[] args) {
		int meret = 5;
		int[] egeszTomb = new int[meret];
		InputStreamReader bemenetiAdatFolyam = new InputStreamReader(System.in);
		BufferedReader beolvasas = new BufferedReader(bemenetiAdatFolyam);
		BufferedReader beolvasas2 = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < egeszTomb.length; i++) {
			try {
				boolean rosszAdat = true;
				do {
					System.out.println("Kerem adja meg" + (i + 1) + ". egesz szamot!");
					System.out.println("szam:");
					try{
					String sztring = beolvasas.readLine();
					egeszTomb[i] = Integer.parseInt(sztring);
					rosszAdat = false;
					}catch(NumberFormatException e){
						System.out.println("Nem egesz szamot adott meg!");	
						System.out.println("Kerem adja meg ujra!");	
					
					}

				} while (rosszAdat);

			} catch (IOException kivetelObjektum) {
			 kivetelObjektum.printStackTrace();	
			}
			
		}

	}

}
