package d16_0816;

import java.util.Scanner;

public class Zadatak_if2_08162019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 *  
		 */
		int x, y, z, i, j;
		System.out.println("Uneti dva cela broja");
		System.out.println("X?");
		x = sc.nextInt();
		System.out.println("Y?");
		y = sc.nextInt();
		// System.out.println("Z?");
		// z=sc.nextInt();
		i = x * x;
		j = y * y;
		if (i > j) {
			System.out.println("Kvadrat X-a je veci od kvadrata Y-a");
		} else {
			System.out.println("Kvadrat Y-a je veci od kvadrata X-a");
		}
		System.out.println("Kvadrat X-a je: " + i);
		System.out.println("Kvadrat Y-a je: " + j);

	}

}
