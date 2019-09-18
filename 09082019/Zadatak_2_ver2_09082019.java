package d12;

import java.util.Scanner;

public class Zadatak_2_ver2_09082019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		double a, b, r, p;
		/*
		 U ovoj verziji, unos prestaje ako je prva stranica pravougaonika
		 manja od 0.
		 U prethodnoj verziji test se radi tek posle unosa obe stranice
		 */
		System.out.println("Unesite ime geometrijske figure ciju povrsinu zelite da izracunate\nMoguce opcije su: pravougaonik, kvadrat ili krug");
		s=sc.nextLine();
		
		switch (s) {
		
		case "pravougaonik":
			System.out.print("Unesite duzinu jedne stranice pravougaonika: ");
			a=sc.nextDouble();
			if (a<=0) {
				System.out.println("Uneta vrednost stranice mora biti pozitivna");
			}
			else if (a>0) {
			System.out.print("Unesite duzinu druge stranice pravougaonika: ");
			b=sc.nextDouble();
			if (b>0) {
				p=a*b;
				System.out.println("Povrsina pravougaonika je: "+p);
			}
			else if (b<=0) {
				System.out.println("Obe stranice moraju imati pozitivnu vrednost");
			}
			
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
	
	default:
		System.out.println("*********************************");
		System.out.println("Unet je pogresan naziv figure.\nVise srece sledeci put.\tIliti citaj pazljivije zahtev :)");
		System.out.println("*********************************");
		}
	}

}
