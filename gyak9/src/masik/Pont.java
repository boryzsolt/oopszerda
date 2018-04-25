package masik;

public class Pont {
	private double x;
	private double y;
	
	public Pont(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "x: " + x + ", y: " + y;
	}	
}
