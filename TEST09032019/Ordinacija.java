package T2_09032019;

import java.util.ArrayList;
import java.util.List;

public class Ordinacija {
	/*
	  
	  
	 Moze da se dohvati broj pacijenata/doktora. 
	 Moze da se naplati usluga pacijentima, 
	 ali ukoliko neki pacijent ne poseduje dovoljno novca 
	 ispisuje se poruka: “PACIJENT ide u zatvor”. 
	 Ordinacija takodje moze da isplati platu stomatolozima u zadatom iznosu, 
	 a povratna vrednost je indikator da li je plata uspesno isplacena. 
	 Moze da se sastavi tekstualni opis:
*/
	
	private String naziv; //Ordinacija poseduje naziv
	private List<Pacijent> pacijenti; //listu pacijenata,
	private List<Stomatolog> stomatolozi; //listu stomatologa,
	private double cenaUsluge; //cenu usluge
	private double stanje;//kao i stanje racuna. 
	private double plata;	
	
	public Ordinacija(String naziv, double cenaUsluge) {
		this.naziv=naziv;
		this.cenaUsluge=cenaUsluge;
		stanje=0;
		stomatolozi = new ArrayList<>();
		pacijenti = new ArrayList<>();
	}
	
	public List<Stomatolog> getStomatolozi() {
		return stomatolozi;
	}

	public List<Pacijent> getPacijenti() {
		return pacijenti;
	}
	

	//Naziv i cena  se zadaju prilikom kreiranja i mogu samo da se dohvate.
	public String getNaziv() {
		return naziv;
	}
	public double getCenaUsluge() {
		return cenaUsluge;
	}
	
	public double getPlata() {
		return plata;
	}
	public void setPlata(double plata) {
		this.plata=plata;
	}

	
	//Moze da se dodati/ukloni doktor.
	public void addStomatolog(Stomatolog stomatolog) {
		stomatolozi.add(stomatolog);
	}
	
	public void izbaciStomatolog(Stomatolog stomatolog) {
		stomatolozi.remove(stomatolog);
	}
	
	//Moze da se doda/ukloni pacijent.
	public void addPacijent(Pacijent pacijent) {
		pacijenti.add(pacijent);
	}
	public void izbaciPacijent(Pacijent pacijent) {
		pacijenti.remove(pacijent);
	}
	
	public void brojPacijenta() {
		pacijenti.size();
	}
	public void brojStomatologa() {
		stomatolozi.size();
	}
		
	public String naplati(Pacijent p) {
		if(p.getPare()<cenaUsluge) {
			return "Pacijent ide u zatvor";
		}
	
	p.oduzmiNovac(cenaUsluge);
	return "Usluga placena";
}
	
	
	public void isplatiPlatu() {
		for (Stomatolog s: stomatolozi) {
			System.out.println(s.getPare());
		}
	}
	
	public String isplatiPlatu(double plata) {
		if (plata * stomatolozi.size() <= stanje) {
			stanje -= plata * stomatolozi.size();
			for (Stomatolog s : stomatolozi) {
				s.dodajNovac(plata);
			}
			return "Plate su isplacene";
		}
		return "Ne postoji dovoljno novca za isplatu u ordinaciji";
	}

	public double getStanje() {
		return stanje;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(getNaziv()).append(":").append(getCenaUsluge()).append("\n");
		sb.append("DOKTORI").append("\n");
		for (Stomatolog s: stomatolozi) {
			sb.append(s);
		}
		sb.append("PACIJENTI").append("\n");
		for (Pacijent p: pacijenti) {
			sb.append(p);
		}
		return sb.toString();
	}
	
	
}
