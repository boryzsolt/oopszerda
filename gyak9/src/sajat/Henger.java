package sajat;
import java.lang.Math;
public class Henger extends Hasab {
private int sugar;
	public Henger(int magassag, int sugar) {
		super(magassag);
		this.sugar=sugar;
	}
	@Override
	public double getAlapterulet() {
		// TODO Auto-generated method stub
		return Math.pow(sugar, 2)*Math.PI;
}
	@Override
	public String toString() {
		return "Henger [sugar=" + sugar + ", getAlapterulet()=" + getAlapterulet() + ", getMagasssag()="
				+ getMagasssag() + ", getTerfogat()=" + getTerfogat() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

















}
