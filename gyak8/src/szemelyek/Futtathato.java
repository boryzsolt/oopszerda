package szemelyek;
import java.util.Scanner;
import szemelyek.*;
public class Futtathato {

	public static void main(String[] args) {
	Szemely szemely1;
	Szemely szemely2;
	String nev;
	int kor;
	Scanner bemenet = new Scanner(System.in);
	System.out.println("Kerem a szemely nevet!");
	nev = bemenet.nextLine();
	
	kor = bemenet.nextInt(); bemenet.nextLine();
	if (kor<18){
	System.out.println("Iskola:");
	String iskola = bemenet.nextLine();
	szemely1 = new Gyerek (nev, kor, iskola);
	}
	else {
		System.out.println("Munkahely:");
		String munkahely = bemenet.nextLine();
		szemely1 = new Felnott (nev, kor, munkahely);	
		}
	System.out.println(szemely1);
	System.out.println(szemely1.getClass());
	System.out.println(szemely1 instanceof Szemely);
	System.out.println(szemely1 instanceof Gyerek);
	System.out.println(szemely1 instanceof Felnott);
	bemenet.close();
	
	}

}
