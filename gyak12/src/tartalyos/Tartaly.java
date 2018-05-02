package tartalyos;

public class Tartaly extends Tarolo {
	private double nyomas;

	public Tartaly(int terfogat, double nyomas) {
		super(terfogat);
		this.nyomas = nyomas;

	}

	@Override
	public boolean veszelyesE() {
		if (terfogat * nyomas > 100) {
			return true;
		} else {
			return false;
		}
	}

	
	
	@Override
	public String toString() {
		boolean veszelyes = veszelyesE();
		return "terfogat" + terfogat + "nyomas" + nyomas + (veszelyes ? "igen" : "nem");
	}


}
