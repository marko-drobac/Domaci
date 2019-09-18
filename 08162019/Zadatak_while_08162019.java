package d16_0816;

public class Zadatak_while_08162019 {

	public static void main(String[] args) {
		int i, sum, k, l, x, y;
		i = 100;
		sum = 0;
		/*	Ispisati sve trocifrene brojeve cija je suma cifara 17.
		 * Rijesiti sa jednom petljom.
		 * Ovo je bio zadatak za for ali sam se zeznuo
		 * pa uradio preko while-a
		 */
		
		
		
		while (i<1000) {
			k=i%10;
			x=i/10;
			l=x%10;
			y=x/10;
			sum=k+l+y;
			
			if (sum==17) {
				System.out.println(i);
			}
			i++;
		}
		

	}

}
