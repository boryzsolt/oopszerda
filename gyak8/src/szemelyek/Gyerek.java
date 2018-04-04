package szemelyek;

public class Gyerek extends Szemely {
private String iskola;

public Gyerek(String nev, int kor, String iskola) {
	super(nev, kor);
	this.iskola = iskola;
}

@Override
public String toString() {
	return "Gyerek [iskola=" + iskola + ", getNev()=" + getNev() + ", getKor()=" + getKor() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
























}
