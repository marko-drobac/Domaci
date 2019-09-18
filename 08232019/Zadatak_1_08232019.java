package _0823;

import java.util.Scanner;

public class Zadatak_1_08232019 {

	public static void main(String[] args) {
		/*Napisati program koji ucitava ceo broj n.
		 * Taj broj n se prosledjuje metodi koja formira i vraca 
		 * ceo broj koji predstavlja inverzan broj.
			Glavni program nakon toga ispisuje taj inverzan broj.
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi ceo broj");
		int n=sc.nextInt();
		System.out.println(invertor(n));	
	}
	
	public static int invertor(int x) {
		int k=0;
		while (x!=0) {
			int c=x%10;
			k=k*10+c;
			x/=10;
		}
		
		return k;
	}

}
