package d16_0816;

import java.util.Scanner;

public class Zadatak_for_08162019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,k,n;
		
		System.out.println("N?");
		n=sc.nextInt();
		/*
		 * Napisati program za ispis obrnutog trougla sa zeljenim brojem redova:
		 * zadatak 90_14
		 * 
		 */
		for (i=0; i<n; i++) {
			for (j=0; j<i; j++) {
				System.out.print(" ");
			}
			
			for (j=n; j>=(2*i-1); j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
