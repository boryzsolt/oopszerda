package szemelyek;

public class Felnott extends Szemely {
private String munkahely;

public Felnott(String nev, int kor, String munkahely) {
	super(nev, kor);
	this.munkahely = munkahely;
}

public String getMunkahely() {
	return munkahely;
}

public void setMunkahely(String munkahely) {
	this.munkahely = munkahely;
}

@Override
public String toString() {
	return "Szulo [munkahely=" + munkahely + ", getMunkahely()=" + getMunkahely() + ", getNev()=" + getNev()
			+ ", getKor()=" + getKor() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}




























}
