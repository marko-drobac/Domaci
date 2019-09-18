package pp;

import java.util.Scanner;

public class Zadatak_2_08082019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Scanner sc2=new scanner(system.in);
		int a, b, o, p;
		double om, pm;
		
		System.out.println("Uneti celobrojne vrednosti u centimetrima.");
		System.out.println();
		System.out.print("Uneti duzinu jedne stranice pravougaonika:  ");
		a=sc.nextInt();
		System.out.print("Uneti duzinu druge stranice pravougaonika:  ");
		b=sc.nextInt();
		System.out.println();
		o=(2*a)+(2*b); //ova formula moze i bez zagrada
		om= o *0.01;
		p=a*b;
		pm= p*0.0001;
		
		System.out.println("Obim pravougaonika je " + o + " centimetara.");
		System.out.println("U metrima iznosi " + om+ " metara.");
		System.out.println("****************************************************");
		System.out.println("Povrsina pravougaonika je " + p + " kvadratnih centimetara.");
		System.out.println("U kvadratnim metrima iznosi " + pm);
	



	}

}
