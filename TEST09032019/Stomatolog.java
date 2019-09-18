package T2_09032019;

public class Stomatolog extends Covek{
	
	public Stomatolog(String naziv, String jmbg) {
		super(naziv, jmbg);
	}
	
	@Override
	public String toString() {
		return "S_" + super.toString();
	}
	
	
	
}
