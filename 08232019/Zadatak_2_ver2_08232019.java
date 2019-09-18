package _0823;

import java.util.Scanner;

public class Zadatak_2_ver2_08232019 {

	public static void main(String[] args) {
		Scanner buljko=new Scanner(System.in);
		int[] niz3= new int[3];
		ucitajNiz(niz3);
		
	}
	public static void ucitajNiz(int[] praviniz) {
		Scanner buljko=new Scanner(System.in);
		System.out.print("Uneti 3 broja");
		for (int i=0; i<praviniz.length; i++) {
			praviniz[i]=buljko.nextInt();
		}
		System.out.println("Brojevi od " + praviniz[0] + " do " + praviniz[1] + " deljivi sa "+ praviniz[2] + " su ");
		while (praviniz[0]<praviniz[1]) {
			praviniz[0]++;
			if(praviniz[0]%praviniz[2]==0) {
				System.out.print(praviniz[0] + " ");
			}
		}
	}
	
}


