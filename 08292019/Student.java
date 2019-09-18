package Fakultet;

public class Student extends Covek {

	
	private String indeks;
	private int godina;
	private String prosek;

	public Student(String ime, String prezime, int dob, int godina, String prosek, String indeks) {
		super(ime, prezime, dob);		
		this.prosek = prosek;
		this.godina = godina;
		this.indeks=indeks;
		
	}

	public String getIndeks() {
		return indeks;
	}
	
	public int getGodina() {
		return godina;
	}

	public String getProsek() {
		return prosek; 
	}

	/*
	public String ispisi() {
		StringBuilder sb= new StringBuilder();
		sb.append(super.getIme()).append("_").append(super.getPrezime()).append("[");
		sb.append(super.getDob()).append(" je student").append(this.godina).append(" godine sa prosekom ");
		sb.append(this.prosek);
		return sb.ispisi;
	}
	 */
	
	public String ispisi() {
		return super.getIme() + super.getPrezime() + super.getDob() + godina + prosek;
	}
	

}
