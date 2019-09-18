package T2_09032019;

public abstract class Covek {
	
	//Covek poseduje naziv, jedinstveni automatski identifikator, JMBG i novac.
	private static int UID=0;
	
	private String naziv;
	private String jmbg;
	private int id;
	private double pare;
	
	public Covek(String naziv, String jmbg) {
		this.naziv=naziv;
		this.jmbg=jmbg;
		id=++UID;
	}
	
	
	//Naziv i JMBG se zadaju prilikom kreiranja
	//Svi sadrzani podaci mogu samo da se dohvate.
	public static int getUID() {
		return UID;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv=naziv;
	}
	
	public String getJmbg() {
		return jmbg;
	}
	
	public void setJmbg(String jmbg) {
		this.jmbg=jmbg;
	}
	
	public int getId() {
		return id;
	}
	
	/*Novac moze da se doda i da se oduzme, gde je povratna vrednost indikator 
	 uspesnosti oduzimanja/dodavanja novca.
	 */
	public double getPare() {
		return pare;
	}
	public void dodajNovac(double novac) {
		if(novac>0) {
			pare+=novac;
		}
	}
	public void oduzmiNovac(double novac) {
		if(novac>0 && pare>=novac) {
			pare-=novac;
		}
	}
	
	
	
	//Moze da se sastavi tekstualni zapis u obliku: NAZIV[ID:JMBG:NOVAC]
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(naziv).append("[").append(id).append(":");
		sb.append(jmbg).append(":").append(pare).append("]");
		
		return sb.toString();
		
	}
	
	
}
