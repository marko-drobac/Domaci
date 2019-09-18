package Fakultet;

import java.util.ArrayList;
import java.util.List;

public class Profesor_ver2 extends Covek_ver2 {
	
	//nisu sva resenja moja, imao sam pomoc
	
	private String titula;
	private ArrayList<String> predmeti;
	
	public Profesor_ver2 (String ime, String prezime, int dob, String titula) {
		super(ime, prezime, dob);
		this.titula=titula;
		this.predmeti = new ArrayList<String>();
		
	}
	public String getTitula() {
		return titula;
	}
	
	public void dodajPredmet(String predmet) {
		if (predmet == null) {
			return;
		}
		this.predmeti.add(predmet);
	}

	public void oduzmiPredmet(String predmet) {
		if (predmet.equals(null)) {
			return;
		}
		for (int i = 0; i < predmeti.size(); i++) {
			if (predmeti.get(i).equals(predmet)) { 
				predmeti.remove(i);
				break;
			}
		}
	}
	
	public String ispisi() {
		String s = "";
		s += super.ispis();
		s += "je "+"("+titula+")"+ "koji drzi nastavu na:\n";
		for (String c: predmeti) {
			s+= c + "\n";
		}
		return s;		
	}
	
}


