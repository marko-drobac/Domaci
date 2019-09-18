package _0830_parcela;

public abstract class Parcela {
	
	private static int uniID=0;
	
	protected double povrsina;
	private int id;
	protected char oznaka;
	
	public Parcela(double povrsina) {
		this.povrsina=povrsina;
		id=++uniID;
	}
	
	public double getPovrsina() {
		return povrsina;
	}
	public int getId() {
		return id;
	}
	public char getOznaka() {
		return oznaka;
	}
	public abstract double getPrinos(int godine);
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
	    sb.append(oznaka+"-"+id+"["+povrsina+"]");
	    return sb.toString();
	}
	

}
