package _0827;

public class Knjige {
	private String imeKnjige;
	private String autor;
	private String brStr;
	private int izdanje;
	
	
	public Knjige (String imeKnjige, String autor, String brStr ) {
		this.imeKnjige=imeKnjige;
		this.autor=autor;
		this.brStr=brStr;
	}
	
	public String getImeKnjige() {
		return imeKnjige;
	}
	
	
	public String getAutor() {
		return autor;
	}
	public String getBrStr() {
		return brStr;
	}
	public int getIzdanje() {
		return izdanje;
	}
	public void setIzdanje(int izdanje) {
		this.izdanje=izdanje;
	}
	
	
	
}
