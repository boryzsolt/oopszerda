package gyak4;

public class Alkalmazotthasznalo {

	public static void main(String[] args) {
		
		Alkalmazott alkalmazottobj = new Alkalmazott();
		// alkalmazottobj.nev="Paksi Andras";
		// alkalmazottobj.fizetes=10;
		// alkalmazottobj.fizetesNovelese(5);
		alkalmazottobj.setNev("Paksi Andras");
		
		System.out.println();
		
		System.out.println(alkalmazottobj.toString());
		System.out.println(alkalmazottobj);
		
		
		Alkalmazott alkalmazott2 = new Alkalmazott();

		alkalmazott2.setNev("Laszlo Maria");
		alkalmazott2.setFizetes(35);
		// alkalmazott2.fizetesnovelese(11);
		
		System.out.println(alkalmazott2);
		
		Alkalmazott[] alkalmazottak = new Alkalmazott[5];

		for (int i = 0; i < alkalmazottak.length; i++) {
			alkalmazottak[i] = new Alkalmazott();
			alkalmazottak[i].setNev("XY");
			alkalmazottak[i].setFizetes((long) (Math.random() * 50));
			System.out.println(alkalmazottak[i]);
		}
		
		int maxfizetesualkindexe = 0;
		
		for (int i = 1; i < alkalmazottak.length; i++) {
			if (alkalmazottak[i].getFizetes() > alkalmazottak[maxfizetesualkindexe].getFizetes()) {
				maxfizetesualkindexe = i;
			}
		}
		
		System.out.println("Legnagyobb fizetesu alk.:");
		System.out.println(alkalmazottak[maxfizetesualkindexe]);

	}

}
