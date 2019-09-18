package Fakultet;

public class Student_ver2 extends Covek_ver2 {

	//nisu sva resenja moja, imao sam pomoc
	
	private String indeks;
	private int godina;
	private double prosek;

	public Student_ver2(String ime, String prezime, int dob,  String indeks, double prosek, int godina) {
		super(ime, prezime, dob);		
		this.indeks=indeks;
		this.prosek = prosek;
		this.godina = godina;
		
		
	}

	public String getIndeks() {
		return indeks;
	}
	
	public int getGodina() {
		return godina;
	}

	public double getProsek() {
		return prosek; 
	}
	public String ispisi() {
		String s="";
		s+=super.ispis()+"je student "+godina+" godine studija sa prosekom "+prosek;
		return s;
	} 
	
	/*
	public String ispisi() {
		StringBuilder sb= new StringBuilder();
		sb.append(super.getIme()).append("_").append(super.getPrezime()).append("[");
		sb.append(super.getDob()).append(" je student").append(this.godina).append(" godine sa prosekom ");
		sb.append(this.prosek);
		return sb.ispisi;
	}
	
	
	public String ispisi() {
		return super.getIme() + super.getPrezime() + super.getDob() + godina + prosek;
	}
	 */

}
