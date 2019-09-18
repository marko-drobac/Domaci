package _0821;

import java.util.Scanner;

public class Zadatak_3_08212019 {

	public static void main(String[] args) {
/*Napisati program koji ucitava duzinu niza, niz i proverava da li je niz rastuci.
Primer1 niza: 3 54 123 18
Ispis: Niz nije rastuci.
Primer2 niza: 71 422 1001 5050
Ispis: Niz je rastuci.
*/
		Scanner snimac= new Scanner(System.in);
		System.out.println("Duzina niza?");
		int duzina=snimac.nextInt();
		int[] ovojeniz=new int[duzina];
		boolean jeRastuci = true;
		System.out.print("Uneti elemente niza");
		for (int i=0; i<ovojeniz.length; i++) {
			ovojeniz[i]=snimac.nextInt();
		}
		
		for (int j=0; j<duzina-1; j++) {
			
			if (ovojeniz[j]>=ovojeniz[j+1]) {
			jeRastuci=false;	
				break;
			}
		}
			if (jeRastuci) {
				System.out.println("Niz je rastuci");
			}
			else {
				System.out.println("Niz je opadajuci");
			}
							
		}
		


}
