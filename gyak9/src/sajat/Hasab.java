package sajat;

public abstract class Hasab {
	private int magassag;

	public Hasab(int magassag) {
		super();
		this.magassag = magassag;
	}

	public int getMagasssag() {
		return magassag;
	}

	public void setMagasssag(int magasssag) {
		this.magassag = magasssag;
	}

	public abstract double getAlapterulet();// nem mondja meg, hogy hogyan
											// szamitom ki az alapteruletet

	public double getTerfogat() {
		return getAlapterulet() * magassag;
	}

	public boolean nagyobbTerfogatu(Hasab masikHasab) {
		if (getTerfogat() > masikHasab.getTerfogat()) {
			return true;
		} else {
			return false;
		}

	}

}
