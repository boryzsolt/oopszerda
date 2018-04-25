package polinom;

import matematika.Polinom;

public class LinearisPolinom implements Polinom {
//adattag a, b valos
private double a;
private double b;
public LinearisPolinom(double a, double b) {
	super();
	this.a = a;
	this.b = b;
}

	@Override
	public double szamol(double x) {
		// TODO Auto-generated method stub
		return (a*x)+b;
	}

	@Override
	public int polinomFoka() {
		// TODO Auto-generated method stub
		return 1;
	}
//toString
public String toString(){//(Pl.: y=2x+3)
return "y="+a+"x"+(b<0 ? "":"+")+b;	
}	























}
