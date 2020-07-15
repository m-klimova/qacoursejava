package main;

public class Square implements IShape {
	
	private double x;
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double iCalculateArea() {
		return x * x;
	}

}
