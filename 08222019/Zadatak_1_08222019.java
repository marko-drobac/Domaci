package _0822;

import java.util.Scanner;

public class Zadatak_1_08222019 {

	public static void main(String[] args) {
		/*Napisati program u kom se unose 3 realna broja i poziva i ispisuje dve metode(u mainu). 
		 * Prva metoda vraca proizvod unetih brojeva. 
		 * Druga metoda ispisuje najmanji od unesenih brojeva.
		*/
		Scanner buljko=new Scanner(System.in);
		// buljko bulji u sta se pise tastaturom
		//nije onaj za sankanje
		System.out.print("N ");
		double n=buljko.nextDouble();
		System.out.print("M ");
		double m=buljko.nextDouble();
		System.out.print("K ");
		double k=buljko.nextDouble();
		System.out.println(proizvod(n,m,k));
		System.out.println(minimum(n,m,k));
		
	}

	public static double proizvod(double x, double y, double z) {
		double rez= x * y * z;
		return rez;
	}
	
	
	
	/*samo sam zamenio x sa min kako ne bih imao vise koda
	 * nego sto je minimalno potrebno
	 */
	public static double minimum(double min, double y, double z) {
	 	if (min>y) {
		 min=y;
		
		 if (min>z) {
			 min=z;
		 }
		}
		return min;
	}
	}





