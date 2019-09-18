package ucionica;

public class Laptop {
	/*Laptop poseduje polaznika i marku koji se zadaju prilikom kreiranja.
	 * Marka moze samo da se dohvati.
	 * Laptop takdje moze da menja polaznika ili da ostane bez polaznika.
	 * Moze da se ispise u obliku: MARKA{POLAZNIK}
*/
private String marka;
private Polaznik polaznik;

public Laptop(String marka) {
	this.marka=marka;
	
	
}

public String getMarka() {
	return marka;
}
public Polaznik getPolaznik() {
	return polaznik;
}

public void setPolaznik(Polaznik polaznik) {
	this.polaznik=polaznik;
}
public void resetPolaznik() {
	polaznik=null;
}
public String ispisi() {
	String s;
	if (polaznik==null) {
		s="nema polaznika";
	}
	else {
		s=polaznik.ispisi();
	}
	return marka+"{"+s+"}";
}


}
