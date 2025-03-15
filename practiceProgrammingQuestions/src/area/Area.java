package area;

public class Area {

	public double circle(double r) {
		return Math.PI*Math.pow(r, 2);
	}
	public double square(double side) {
		return Math.pow(side, 2);
	}
	public double rectangle(double l, double b) {
		return l*b;
	}

}