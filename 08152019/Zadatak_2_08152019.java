package d15_0815;

import java.util.Scanner;

public class Zadatak_2_08152019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n, n1=0, n2=1, sum=0 ;
		System.out.println("N?");
		n=sc.nextInt();
		System.out.print(n1+""+n2);
		//System.out.print(n2);
		for (i=2; i<n; i++) {
			sum= n1 + n2;
			n1=n2;
			n2=sum;
		
		System.out.print(sum);
		}

	}

}
