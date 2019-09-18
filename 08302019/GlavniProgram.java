package _0830_parcela;

public class GlavniProgram {

	public static void main(String[] args) {
		
		//imao sam pomoc pri izradi domaceg
		
		Njiva n1 = new Njiva(200.0, 100);
		Njiva n2 = new Njiva(400.0, 250);
		Suma s1 = new Suma(500, 200, 50, 3);
		Suma s2 = new Suma(800, 550, 350, 2);
		Parcela [] nizzko = new Parcela [10];
		Parcela[]niz= {n1, n2,s1, s2};
		for (int i=0; i<niz.length; i++) {
			System.out.println(niz[i]);
		}
		
		

	}

}
