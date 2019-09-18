package d15_0815;

import java.util.Scanner;

public class Zadatak_1_08152019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c, r, h, p;
		double pi = 3.14;
		int i;
		/*
		 * Napisati program - meni - za izracunavanje i ispis povrsina geometrijskih
		 * tela (kocke, kvadra, valjka, lopte). Koristiti do while petlju i switch
		 * grananje. Za izlaz koristiti nulu (0).
		 */
		do {
			System.out.println();
			System.out.println("Izaberi povrsinu koju zelis da izracunas");
			System.out.println("1 - Kocka");
			System.out.println("2 - Kvadar");
			System.out.println("3 - Valjak");
			System.out.println("4 - Lopta");
			System.out.println("0 - Izlaz");
			i = sc.nextInt();

			switch (i) {
			case 1:
				System.out.println("Unesi duzinu stranice");
				System.out.println("Duzina mora biti veca od 0");
				a = sc.nextDouble();
				p = 6 * a * a;
				System.out.println("Povrsina je: " + p);
				break;
			case 2:
				System.out.println("Sve stranice moraju biti vece od 0");
				System.out.println("Unesi jednu stranicu kvadra");
				a = sc.nextDouble();
				System.out.println("Unesi drugu stranicu kvadra");
				b = sc.nextInt();
				System.out.println("Unesi trecu stranicu kvadra");
				c = sc.nextDouble();
				p = 2 * (a * b + b * c + a * c);
				System.out.println("Povrsina kvadra je: " + p);
				break;
			case 3:
				System.out.println("Vrednosti moraju biti vece od 0");
				System.out.println("Uneti poluprecnik valjka");
				r = sc.nextDouble();
				System.out.println("Uneti visinu valjka");
				h = sc.nextDouble();
				p = (2 * r * pi) * h + 2 * (r * r * pi);
				System.out.println("Povrsina valjka je: " + p);
				break;
			case 4:
				System.out.println("Unesi poluprecnik lopte");
				System.out.println("Vrednost mora biti veca od 0");
				r = sc.nextDouble();
				p = 4 * r * r * pi;
				System.out.println("Povrsina lopte je: " + p);
				break;
			case 0:
				System.out.println("Izlaz iz programa");
				break;
				
			default:
				System.out.println("Los unos!");
			}

		} while (i != 0);

	}

}
