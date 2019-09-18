package _09122019;

public class Calculator {
	
	private static double total=0;
	
	public Calculator add(double x) {
		total += x;
		return this;
	}
	
	public Calculator sub(double x) {
		total -= x;
		return this;
	}
	
	public Calculator mul(double x) {
		total *= x;
		return this;
	}
	
	public Calculator div(double x) {
		total /= x;
		return this;
	}
	
	public double value() {
		return total;
	}

}
