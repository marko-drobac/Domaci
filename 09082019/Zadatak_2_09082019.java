package d12;

import java.util.Scanner;

public class Zadatak_2_09082019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		double a, b, r, p;

		System.out.println("Unesite ime geometrijske figure ciju povrsinu zelite da izracunate\nMoguce opcije su: pravougaonik, kvadrat ili krug");
		s=sc.nextLine();
		
		switch (s) {
		case "pravougaonik":
			System.out.print("Unesite duzinu jedne stranice pravougaonika: ");
			a=sc.nextDouble();
			System.out.print("Unesite duzinu druge stranice pravougaonika: ");
			b=sc.nextDouble();
			if(a>0 && b>0) {
			p= a * b;
			System.out.println("\nPovrsina pravougaonika je: " + p);
			} else if (a<=0 || b<=0) {
				System.out.println("Unete vrednosti moraju biti vece od 0");
			}
			break;
		case "kvadrat":
			System.out.print("Unesite duzinu stranice kvadrata: ");
			a=sc.nextDouble();
			if (a>0) {
			p= a*a;
			System.out.println("Povrsina kvadrata je:" +p);
			}
			else if (a<=0) {
				System.out.println("Uneta vrednost mora biti veca od 0");
			}
			break;
		case "krug":
			System.out.print("Uneti poluprecnik kruga: ");
			r= sc.nextDouble();
			if (r>0) {
			p= r*r*3.14;
			System.out.println("Povrsina kruga je");
			}
			else if (r<=0) {
				System.out.println("Uneta vrednost mora biti veca od 0");
			}
			break;
			default: System.out.println("\n*********************************\nUnet je pogresan naziv figure.\nVise srece sledeci put.");
		}
	}

}
