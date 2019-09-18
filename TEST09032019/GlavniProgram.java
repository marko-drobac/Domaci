package T2_09032019;

public class GlavniProgram {

	public static void main(String[] args) {
		Pacijent p0=new Pacijent("Pera", "001");
		Pacijent p1=new Pacijent("Zdera", "002");
		Pacijent p2=new Pacijent("Mika", "003");
		Stomatolog s0= new Stomatolog("Cika Zuba", "121");
		Stomatolog s1=new Stomatolog("Zubovad", "111");
		Ordinacija o1=new Ordinacija ("Veliki zub", 200);
		p0.dodajNovac(800);
		p1.dodajNovac(1000);
		p2.dodajNovac(100);
		System.out.println(p0.getPare());
		System.out.println(o1.getCenaUsluge());
	
	
	
	
	
	
	}

}
