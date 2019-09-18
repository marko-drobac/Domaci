package d14;

import java.util.Scanner;

public class Zadatak_2c_sum_ver2_8132020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k, sum;
		sum = 0;
		System.out.println("Uneti K");
		k = sc.nextInt();
		System.out.println("Uneti N.\nNapomena: N mora biti vece od K.");
		n = sc.nextInt();

		if (k < n) {
			while (k < n) {
				sum += k;
				k++;
			}
			System.out.println("Zbir brojeva je: " + sum);

		} else if (n < k) {
			System.out.println("Posto niste ispostovali zahtev K < N,");
			System.out.println("imamo resenje i za vas specijalce.");
			while (n < k) {
				sum += n;
				n++;
			}
			System.out.println("Zbir je: " + sum);
		} else {
			System.out.println("Brojevi K i N su isti");
		}
	}

}
