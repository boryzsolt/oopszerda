package masik;

import java.awt.Color;
import sajat.Szinezheto;

public class SzinesPont extends Pont implements Szinezheto {
	private Color szin;
		
	public SzinesPont(Color szin) {
		this(0, 0, szin);
	}

	public SzinesPont(double x, double y, Color szin) {
		super(x, y);
		this.szin = szin;
	}

	@Override
	public String toString() {
		//return super.toString() + ", szin: " + szin;
		return super.toString() + ", szin: " + szin;
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