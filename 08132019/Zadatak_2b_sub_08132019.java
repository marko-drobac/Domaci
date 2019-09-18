package d14;

import java.util.Scanner;

public class Zadatak_2b_sub_08132019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i, n, sum;
		i=1;
		sum=0;
		System.out.println("Unesi N");
		n=sc.nextInt();
		while (i<n) {
			sum=sum-i;
			i++;
		}
	System.out.println("Rez je: " + sum);
	}

}
