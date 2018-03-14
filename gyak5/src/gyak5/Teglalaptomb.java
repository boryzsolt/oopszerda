package gyak5;

public class Teglalaptomb {

	public static void main(String[] args) {
	int meret=10;
	//Teglalap[] teglalapok=new Teglalap[meret];
	Teglalap teglalapok[]=new Teglalap[meret];
	for (int i = 0; i < teglalapok.length; i++) {
	teglalapok[i]=new Teglalap((int)(Math.random()*9+2));	
	System.out.println(teglalapok[i]);
	}
	int minindexuteglalap=0;
	for (int i=1; i<teglalapok.length; i++){
	if (teglalapok[minindexuteglalap].nagyobbTeruletuMint(teglalapok[i])){
	minindexuteglalap=i;
	}
	}
	}
}
