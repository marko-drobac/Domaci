package _0827;

public class GP {

	public static void main(String[] args) {
		/*Napisati klasu Knjige koja ima sledeca polja:
		 * naziv knjige, autora, broj strana, godinu izdanja. 
		 * Sva polja mogu da se dohvate, a godina izdanja moze i da se postavi.
Napisati glavni program koji kreira tri knjige i ispisuje sve njihove podatke.
*/
		Knjige k=new Knjige("Ana Karenjina", "Tolstoj", "previse");
		Knjige k2=new Knjige("Pesme", "Jovan Ducic", "200");
		Knjige k3=new Knjige("Jadnici", "Viktor Igo", "ne znam");
		k.setIzdanje(2000);
		k2.setIzdanje(2001);
		k3.setIzdanje(2002);
		System.out.print(k.getImeKnjige()+" "+k.getAutor()+" "+k.getBrStr()+" "+k.getIzdanje());
		System.out.println();
		System.out.print(k2.getImeKnjige()+" "+k2.getAutor()+" "+k2.getBrStr()+" "+k2.getIzdanje());
		System.out.println();
		System.out.print(k3.getImeKnjige()+" "+k3.getAutor()+" "+k3.getBrStr()+" "+k3.getIzdanje());

	}

}
