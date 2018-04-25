package sajat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Proba1 {

	public static void main(String[] args) {
		int szamok[] = new int[5];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			boolean rosszAdat=true;
			
			do {
				System.out.println("Kerem a szamokat!");
				try {
					szamok[i] = s.nextInt();
					s.nextLine();
					rosszAdat=false;
				} catch (InputMismatchException e) {
					System.out.println("Nem szamot adott meg.");
					System.out.println("Inp.Mis.");
					}catch(NumberFormatException e2){
					System.out.println("Egesz szamot adjon meg!");	
					}catch(Exception e){
					System.out.println("Csak szamot adhat meg.");	
					}  
					finally {
					s.nextLine();
				}

				System.out.println("A szam:" + szamok[i]);
				
				
			}while(rosszAdat);
		}
		System.out.println("A beolvasott ertekek:");
		for (int i : szamok) {
			System.out.println(i);
		}

	}

}
