package d13;

import java.util.Scanner;

public class Zadaatak_2_12082019 {
	
	/*
	 * nema izmena u programu
	 * u odnosu na prethodnu verziju
	 */

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n, sum, multi;
		i=0;
		sum=0;
		multi=1;
		
		System.out.println("N?");
		n=sc.nextInt();
		
		while (i<n) {
			if(i%2==0) {
				sum+=i;
			
			} else if(i%2==1){
				multi*=i;
			}
			i++;
			
		}
		System.out.println("Zbir je: " + sum);
		System.out.println("Proizvod je: " + multi);

	}

}
