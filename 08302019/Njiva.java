package _0830_parcela;

public class Njiva extends Parcela{
	
	private double prinosPoKvm;
	
	public Njiva (double povrsina, double prinosPoKvm) {
		super(povrsina);
		this.prinosPoKvm=prinosPoKvm;
		this.oznaka='N';
		
	}

	
	@Override
	public double getPrinos(int godine) {
		return povrsina*prinosPoKvm;
	}
	
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append(super.toString()+":"+ prinosPoKvm);
		return sb.toString();
	}

}
