package d14;

import java.util.Scanner;

public class Zadatak_2c_sub_08132019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k, n, sum;
		sum=0;
		
		System.out.println("Unesi K");
		k=sc.nextInt();
		System.out.println("Unesi N. Ovaj broj mora biti veci od K");
		n=sc.nextInt();
		
		if (k<n) {
			while(k<n) {
				sum-=k;
				k++;
			}
			System.out.println("Rez je: " + sum);
		} else {
			System.out.println("Nije ispostovan zahtev.\nK nije manje od N");
		}

	}

}
