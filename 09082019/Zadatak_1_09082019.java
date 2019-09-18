package d12;

import java.util.Scanner;

public class Zadatak_1_09082019 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		long br;
		System.out.println("Uneti celobrojnu vrednost");
		br=sc.nextLong();
		if (br%2==0){
		System.out.println("Broj je paran");
		}else {
			System.out.println("Broj je neparan");
		}
	}

}
