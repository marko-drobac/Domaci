package d13;

import java.util.Scanner;

public class Zadatak_3_12082019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int i, sum;
			// 08-15-2019 i=0; 
			sum=0;
			
			/* 08-15-2019 sledeca dva reda su dodata
			 jer je potreban unos broja >=0 da bi se 
			uslo u while petlju
			*/
			System.out.println("I?");
			i=sc.nextInt();
			
			while(i>=0) {
				
				//if (i>=0){
				sum+=i;
				// 08-15-2019 sledeca dva reda koda su prebacena
				// da budu posle sum
				System.out.println("I?");
				i=sc.nextInt();
				/*  08-15-2019 }
				else {
				System.out.println("Unesen je negativan broj");
				}
			*/}
	System.out.println("Unesen je negativan broj");		
	System.out.println("Zbir je: " + sum);

	}

}
