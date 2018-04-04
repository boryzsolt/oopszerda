package gyak7;

public class Kenyer extends Aru {
private double mennyiseg;

public Kenyer(String nev, int netto_ar, int afakulcs, double mennyiseg) {
	super(nev, netto_ar, afakulcs);
	this.mennyiseg = mennyiseg;
}

@Override
public String toString() {
	return "Kenyer [mennyiseg=" + mennyiseg + ", brutto_ar()=" + brutto_ar() + ", toString()=" + super.toString()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}

public double getMennyiseg() {
	return mennyiseg;
}

public void setMennyiseg(double mennyiseg) {
	this.mennyiseg = mennyiseg;
}
public static boolean elso_kenyer_nagyobb_egysegaru(Kenyer elso_kenyer, Kenyer masodik_kenyer){
return (elso_kenyer.brutto_ar()/elso_kenyer.mennyiseg)>(masodik_kenyer.brutto_ar()/masodik_kenyer.mennyiseg);	
}





























}
