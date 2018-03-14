package gyak5;

public class Teglalap {
private int a_oldal;
private int b_oldal;
public Teglalap(int a_oldal, int b_oldal) {
	super();
	this.a_oldal = a_oldal;
	this.b_oldal = b_oldal;
}
public Teglalap (int oldalhossz){
//this.a_oldal=this.b_oldal=oldalhossz
a_oldal=oldalhossz;	
b_oldal=oldalhossz;
}
public int terulet(){
return a_oldal*b_oldal;	
}
@Override
public String toString() {
	return "Teglalap [a_oldal=" + a_oldal + ", b_oldal=" + b_oldal + ", terulet()=" + terulet() + "]";
}
public int getA_oldal() {
	return a_oldal;
}
public void setA_oldal(int a_oldal) {
	this.a_oldal = a_oldal;
}
public int getB_oldal() {
	return b_oldal;
}
public void setB_oldal(int b_oldal) {
	this.b_oldal = b_oldal;
}
public void setOldalak(int a_oldal, int b_oldal){
this.a_oldal=a_oldal;
this.b_oldal=b_oldal;
}
public void setOldalak(int oldalhossz){
setOldalak (oldalhossz, oldalhossz);
}
public boolean nagyobbTeruletuMint(Teglalap masikTeglalap){
return terulet()>masikTeglalap.terulet();	
}
public boolean egyezikE(Teglalap masikTeglalap){
return a_oldal==masikTeglalap.a_oldal&&b_oldal==masikTeglalap.b_oldal;	
}



}
