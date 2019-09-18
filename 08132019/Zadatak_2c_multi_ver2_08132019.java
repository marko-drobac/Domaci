package d14;

import java.util.Scanner;

public class Zadatak_2c_multi_ver2_08132019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k, n;
		double multi;
		
		System.out.println("Unesi K");
		k=sc.nextInt();
		System.out.println("Unesi N\nN mora biti vecee od K");
		n=sc.nextInt();
		multi=1;
		if (k<n) {
			while (k<n) {
				multi*=k;
				k++;
			}
			System.out.println("Rez je: " + multi);
		}else if(k>n) {
			System.out.println("Samo za specijalce");
			while (n<k) {
				multi*=n;
				n++;
			} System.out.println("Rez je: " + multi);
		}else {
			System.out.println("K i N su jednaki");
		}

	}

}
