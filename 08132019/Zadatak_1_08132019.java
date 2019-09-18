package d14;

public class Zadatak_1_08132019 {

	public static void main(String[] args) {
		int i, j, k;
		int sum=0;
		
		// suma za dekrement
		i=10;
		while (i>0) {
			sum+=i--;
		} System.out.println(sum);
		
		
		// prikaz inkrementa
		j=0;
		while (j<10) {
			j++;
			System.out.println(j);
		}
		
		
	// ink i dek u jednom
	//dve vrednosti se priblizavaju jedna drugoj
		int x=0;
		int y=10;
		while (x<y) {
				System.out.println("x is: " + x + " and y is: " + y);
				x++;
				y--;
		}
		
		//preincrement iako je pocetna vrednost 0
		//prvi sipis krece od 1 jer se prvo radi povecanje pa ispis
		//dakle za c==19 koje prolazi kroz while petlju, prvo se poveca na 20, pa tek onda upise
		int c=0;
		while (c<20) {
		System.out.print(++c + "\t");
		
		}System.out.println();
	//ovaj post inkrement je za poredjenje sa prethodnim nizom
		int f=0;
		while (f<20) {
		System.out.print(f++ + "\t");
		//System.out.println();
		}System.out.println("\n\n");
	
	
		//predecrement iako je pocetna vrednost 10
				//prvi sipis krece od 9 jer se prvo radi smanjenje pa ispis
				//dakle za c==10 koje prolazi kroz while petlju, prvo se smanjuje na 9, pa tek onda upise
				int v=10;
				while (v>0) {
				System.out.print(--v + "\t");
				
				}System.out.println();
			//ovaj postdekrement je za poredjenje sa prethodnim nizom
				int o=10;
				while (o>0) {
				System.out.print(o-- + "\t");
				//System.out.println();
				}System.out.println();

		
			//predec i pre inc  vs postinc i post dec	
			int q,w,e,r,t,yy;
		q=10; w=15; e=2; t=5; yy=0;
		yy=--q + ++w;
		System.out.print(yy + "\t");
		
		int qq, ww, yyy;
		qq=10; ww=15; e=2; t=5; yyy=0;
		yyy=qq-- + w++;
		System.out.print(yyy);
		
	}

}

