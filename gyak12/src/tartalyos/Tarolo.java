package tartalyos;

public abstract class Tarolo {
protected int terfogat;

public Tarolo(int terfogat) {
	super();
	this.terfogat = terfogat;
}
public abstract boolean veszelyesE();
public int terfogatVisszaado(){
return terfogat;	
}
@Override
public String toString() {
	return "Tarolo [terfogat=" + terfogat + ", veszelyesE()=" + veszelyesE() + ", terfogatVisszaado()="
			+ terfogatVisszaado() + "]";
}










}
