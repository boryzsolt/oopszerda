package sajat;
//import java.lang.Math;
public class Teglatest extends Hasab {
private int a;
private int b;
public Teglatest(int a, int b, int magassag) {
		super(magassag);
		this.a=a;
		this.b=b;
		}

	@Override
	public double getAlapterulet() {
	return a*b;
	}
	@Override
	public String toString() {
		return "Teglatest [a=" + a + ", b=" + b + ", getAlapterulet()=" + getAlapterulet() + ", getMagasssag()="
				+ getMagasssag() + ", getTerfogat()=" + getTerfogat() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}








}
