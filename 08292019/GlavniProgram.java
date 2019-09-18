package Fakultet;

public class GlavniProgram {

	public static void main(String[] args) {
		Profesor p1=new Profesor("Pera", "Peric", 1980, "prof");
		Profesor p2= new Profesor("Zika", "Slika", 1970, "docent");
		//Student s1=new Student("vad", "sad", 2000, "8.71", 3, "001");
		p1.dodajPredmet("eng");
		p1.dodajPredmet("savremeni");
		p2.dodajPredmet("ek");
		p2.dodajPredmet("ek-vezbe");
		System.out.println(p1.ispisi()+p1.getTitula());
		
		//System.out.println(s1.ispisi()+s1.getProsek()+s1.getGodina()+s1.getIndeks());
				
		
		
	}

}
