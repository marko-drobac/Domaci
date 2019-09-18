package T2_09032019;

public class Pacijent extends Covek{
	
	public Pacijent(String naziv, String jmbg) {
		super(naziv, jmbg);
	}
	
	@Override
	public String toString() {
		return "P_" + super.toString();
	}

}
