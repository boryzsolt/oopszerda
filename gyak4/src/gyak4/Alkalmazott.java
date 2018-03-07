package gyak4;

public class Alkalmazott {
	private String nev;
	private long fizetes;

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

	@Override
	public String toString() {
		return "Alkalmazott [nev=" + nev + ", fizetes=" + fizetes + "Ft"+ "]";
	}
}
