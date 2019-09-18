package d15_0815;

import java.util.Scanner;

public class Zadatak_3_08152019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m, n, i, j;

		/*
		 Napravi program koji ce na izlazu izbaciti sliku pravougaonika od zvezdica:

		 */
		
		
		//Promenjen samo tekst u syso linijama
		System.out.println("Brojevi treba da budu veci od 0");
		System.out.println("Unesi broj zvezdica");
		m=sc.nextInt();
		System.out.println("Unesi broj redova");
		n=sc.nextInt();
		
		for (j=1; j<=n; j++) {
			for (i=1; i<=m; i++ ) {
				System.out.print("*\t");
			}
			System.out.println();
		}
		
	}

}
