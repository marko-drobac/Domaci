package d14;

import java.util.Scanner;

public class Zadatak_2c_div_ver2_08132019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k, n;
		double div;
		System.out.println("Unesi K");
		k=sc.nextInt();
		System.out.println("Unesi N, mora biti razlicito od nule");
		n=sc.nextInt();
		div=k;
		k=k+1;
		
		if ((k-1)<n && n!=0){
		while (k<n) {
			div/=k;
			k++;
		} 
		System.out.println("Kol je: " + div);
		}else {
			System.out.println("K mora biti vece od N\ni/ili N razlicito od 0");
		}
				
	}

}
