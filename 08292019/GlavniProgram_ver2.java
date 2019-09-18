package Fakultet;

public class GlavniProgram_ver2 {

	public static void main(String[] args) {
				
		Profesor_ver2 p1=new Profesor_ver2("Pera", "Peric", 1980, "prof");
		Profesor_ver2 p2= new Profesor_ver2("Zika", "Slika", 1970, "docent");
		Student_ver2 s1=new Student_ver2("vad", "sad", 2000, "001/2019", 8.71, 3);
		Student_ver2 s2=new Student_ver2("sad", "nikad", 1999, "008/2018", 7.93, 4);
		Student_ver2 s3=new Student_ver2("Milojko", "Pantic", 1970, "001/1991", 7.50, 4);
		p1.dodajPredmet("eng");
		p1.dodajPredmet("savremeni");
		p2.dodajPredmet("ek");
		p2.dodajPredmet("ek-vezbe");
		System.out.println(p1.ispisi());
		System.out.println(p2.ispisi());
		System.out.println(s1.ispisi());
		System.out.println(s2.ispisi());
		System.out.println(s3.ispisi());

		
	}

}
