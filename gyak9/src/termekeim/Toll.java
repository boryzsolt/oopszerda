package termekeim;

import java.awt.Color;

import sajat.Szinezheto;

public class Toll extends Aru implements Szinezheto {
	private Color szin;
	private String markanev;	
	
	public Toll(String nev, int netto_ar, int afakulcs, Color szin, String markanev) {
		super(nev, netto_ar, afakulcs);
		this.szin = szin;
		this.markanev = markanev;
	}

	public Toll(Color szin, String markanev, int netto, int afa) {
		super("toll", netto, afa);
		this.szin = szin;
		this.markanev = markanev;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", szin: " + szin + ", markanev: " + markanev;
	}

	@Override
	public Color getSzin() {
		return szin;
	}

	@Override
	public void setSzin(Color szin) {
		this.szin = szin;
	}
}