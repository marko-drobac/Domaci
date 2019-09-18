package d14;

import java.util.Scanner;

public class Zadatak_2b_sum_08132019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n, sum;
		i = 1;
		sum = 0;
		System.out.println(" Unesite broj veci od 0?");
		n = sc.nextInt();

		while (i < n) {
			sum += i;
			i++;
		}
		System.out.println("Zbir brojeva je: " + sum);
	}

}
