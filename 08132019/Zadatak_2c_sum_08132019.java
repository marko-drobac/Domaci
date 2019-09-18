package d14;

import java.util.Scanner;

public class Zadatak_2c_sum_08132019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n, k, sum;
		sum=0;
		System.out.println("Uneti K");
		k=sc.nextInt();
		System.out.println("Uneti N.\nNapomena: N mora biti vece od K.");
		n=sc.nextInt();
		
		if(k<n) {
			while (k<n) {
				sum+=k;
				k++;
			}
			System.out.println("Zbir brojeva je: " + sum);
			
		} else {
			System.out.println("K nije manje od N");
		}

	}

}
