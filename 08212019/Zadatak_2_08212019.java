package _0821;

import java.util.Scanner;

public class Zadatak_2_08212019 {

	public static void main(String[] args) {
		Scanner nadzor=new Scanner(System.in);
		
		/*Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim redosledom.
Primer niza: 3 54 123 18
Ispis: 18 123 54 32
*/
		
		System.out.println("Unesi duzinu niza");
		int duzinaniza=nadzor.nextInt();
		int[] ovodefiniseniz=new int[duzinaniza];
		System.out.print("Unesi elemente niza");
		for(int i=0; i<ovodefiniseniz.length; i++) {
			ovodefiniseniz[i]=nadzor.nextInt();
		}
		
		
		
		for (int j=(duzinaniza-1); j>=0; j--) {
			System.out.print(ovodefiniseniz[j] + " ");
			
		}

	}

}
