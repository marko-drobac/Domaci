package d14;

import java.util.Scanner;

public class Zadatak_2b_div_08132019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double i, div, n;
		i=1;
		div=1;
		System.out.println("Unesi N");
		n=sc.nextDouble();
		
		while (i<n) {
			div/=i;
			i++;
		}
System.out.println("Kol je: " + div );
	}

}
