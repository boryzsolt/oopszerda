package Proba;

import java.awt.Color;

import masik.SzinesPont;
import sajat.Szinezheto;
import termekeim.Toll;

public class Futtathato {

	public static void main(String[] args) {

		//ISzinezheto szinesPont = new SzinesPont(Color.BLUE);
		Szinezheto szinesPont = new SzinesPont(1.0, 1.0, Color.BLUE);

		System.out.println(szinesPont);
		szinesPont.setSzin(Color.GREEN);
		System.out.println(szinesPont);

		Futtathato.setAlapertelmezettSzin(szinesPont);
		System.out.println(szinesPont);

		Szinezheto toll = new Toll(Color.YELLOW, "parker", 1, 2);
		
		System.out.println(toll);
		toll.setSzin(Color.BLUE);
		System.out.println(toll);

		Futtathato.setAlapertelmezettSzin(toll);
		System.out.println(toll);		
		
		
		SzinesPont szinesPont2 = new SzinesPont(Color.WHITE);
		System.out.println(szinesPont2);		
	}

	static void setAlapertelmezettSzin(Szinezheto obj) {
		obj.setSzin(obj.alapertelmezettSzin);
	}
}