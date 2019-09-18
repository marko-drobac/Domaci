package _0823;

import java.util.Scanner;

public class Zadatak_3_08232019 {

	public static void main(String[] args) {
		/*Napisati program koji ucitava niz od n celih brojeva i dve metode.
		 * Prva metoda vraca proizvod elemenata na neparnim pozicijama, 
		 * a druga vraca zbir parnih elemenata niza. 
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesi N");
		int n=sc.nextInt();
		int[] niz=new int[n];
		System.out.print("Ucitaj elemente niza");
		for (int i=0; i<niz.length; i++) {
			niz[i]=sc.nextInt();
		}
		System.out.print("Proizvod je " + multiNepar(niz));	
		System.out.print("Zbir parnih elem je " + parnielem(niz));
	}
	public static int multiNepar(int[] niz) {
		int multi=1;
		for (int i=1; i<niz.length; i+=2) {
			 multi=multi*niz[i];
		}
		return multi;
	}
	public static int parnielem(int[] niz) {
		int sum=0;
		for (int i=0; i<niz.length; i++) {
			if (niz[i]%2==0) {
				sum+=niz[i];
			}
		}
		return sum;
				
	}

}
