package _0830_parcela;

public class Suma extends Parcela{
	
	private double povrsStabla;
	private double prinosStabla;
	private int sazrevanje;
	
	public Suma(double povrsina, double povrsStabla, double prinosStabla, int sazrevanje) {
		super (povrsina);
		this.povrsStabla=povrsStabla;
		this.prinosStabla=prinosStabla;
		this.sazrevanje=sazrevanje;
		this.oznaka='S';
	}
	
	@Override
	public double getPrinos(int godine) {

		return povrsina/povrsStabla*prinosStabla*(godine/sazrevanje);
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()+":("+povrsStabla+","+ prinosStabla+","+sazrevanje+")");
		return sb.toString();
	}
	
	

}
