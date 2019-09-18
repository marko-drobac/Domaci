package _0821;

import java.util.Scanner;

public class Zadatak_1_08212019 {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		System.out.println("Uneti broj elemenata niza");
		int n=unos.nextInt();
		System.out.println("Uneti broj za test deljivosti");
		int d=unos.nextInt();
		int[] array=new int[n];
		
		for (int i=0; i<array.length; i++) {
			System.out.println("Unesi element");
			array[i] = unos.nextInt();
			}
		for (int j=0; j<array.length; j++) {
			if(array[j]%d==0) {
				System.out.println("Element niza " + array[j] + " deljiv je sa " + d);
			}
		}

	}

}
