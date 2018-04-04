package szemelyek;

public class Szemely {
private String nev;
private int kor;
public Szemely(String nev, int kor) {
	super();
	this.nev = nev;
	this.kor = kor;
}
public String getNev() {
	return nev;
}
public void setNev(String nev) {
	this.nev = nev;
}
public int getKor() {
	return kor;
}
public void setKor(int kor) {
	this.kor = kor;
}
public boolean koraNagyobbMint(Szemely masikSzemely){
return kor>masikSzemely.kor;	
} 



























}
