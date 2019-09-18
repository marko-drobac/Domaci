package Fakultet;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Covek {
	
	private String titula;
	List<String> predmeti;
	
	public Profesor (String ime, String prezime, int dob, String titula) {
		super(ime, prezime, dob);
		this.titula=titula;
		predmeti = new ArrayList<>();
		
	}
	
	public void dodajPredmet(String predmet) {
		predmeti.add(predmet);
	}
	
	public boolean ukloniPredmet(String predmet) {
		return predmeti.remove(predmet);
	}
	

	public String findPredmet(int i) {
		return predmeti.get(i);
	}
	
	public String findPredmet(String predmet) {
		return predmeti.get(predmeti.indexOf(predmeti));
	}
	public String getTitula() {
		return titula;
	}
	public boolean hasPredmet(String predmet){
		return predmeti.contains(predmet);
	}
		
		public int countPredmete() {
			return predmeti.size();
		}

	

}
