package gyak4;

public class Alkalmazott {
	private String nev;
	private int kor;
	private long fizetes;
	public  static int nyugdijKorhatar=65;
	
	public Alkalmazott(String nev, int kor, long fizetes) {
		super();
		this.nev = nev;
		this.kor = kor;
		this.fizetes = fizetes;
	}

	public Alkalmazott(String nev, int kor) {
		super();
		this.nev = nev;
		this.kor = kor;
		this.fizetes = 10000*kor;
	}
	
	
	public void novel(long novekmeny) {
		fizetes += novekmeny;
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public long getFizetes() {
		return fizetes;
	}

	public void setFizetes(long fizetes) {
		this.fizetes = fizetes;
	}

	public boolean fizetesIntervallumokKozott(long alsohatar, long felsohatar) {
		return fizetes >= alsohatar && fizetes <= felsohatar;
	}
	public int hatraVanNyugdijig(){
	return nyugdijKorhatar-kor;	
	}

	@Override
	public String toString() {
		return "Alkalmazott [nev=" + nev + ", kor=" + kor + ", fizetes=" + fizetes + ", getNev()=" + getNev()
				+ ", getFizetes()=" + getFizetes() + ", hatraVanNyugdijig()=" + hatraVanNyugdijig() + "]";
	}
	public static void setNyugdijkorhatar (int nyugdijkorhatar){
		Alkalmazott.nyugdijKorhatar=nyugdijkorhatar;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
