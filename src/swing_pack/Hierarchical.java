package swing_pack;
class Language{
	int tam,eng;
	Language(int tam,int eng){
		this.tam=tam;
		this.eng=eng;
	}
}
class Sslc extends Language{
	int mat,sci,soc;
	
	Sslc(int t,int e,int ma,int sc,int so){
		super(t,e);
		mat=ma;
		sci=sc;
		soc=so;
	}
	void totel() {
		int tol=tam+eng+mat+sci+soc;
		System.out.println("SSLC Marks: "+ tol);
	}
}
class Hsc extends Language{
	int bio,mat,che,phy;
	Hsc(int t,int e,int b,int m,int c,int p){
		super(t,e);
		bio=b;
		mat=m;
		che=c;
		phy=p;
	}
	void totel() {
		int tol= tam+eng+bio+mat+che+phy;
		System.out.println("HSC Marks: "+tol);
	}
	
}
public class Hierarchical {

	public static void main(String[] args) {
		Sslc sslc=new Sslc(55,77,93,95,99);
		sslc.totel();
		Hsc hsc=new Hsc(55,77,93,95,99,55);
		hsc.totel();
	}

}
