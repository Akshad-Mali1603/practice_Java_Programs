package Inheritance;

public class Vehicle {
	private int no;
	private String color;
	private int seat;
	private String fuel;
	private float price;
	private float mileage;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(int no, String color, int seat, String fuel, float price, float mileage) {
		super();
		this.no = no;
		this.color = color;
		this.seat = seat;
		this.fuel = fuel;
		this.price = price;
		this.mileage = mileage;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getMileage() {
		return mileage;
	}
	public void setMileage(float mileage) {
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return "Vehicle [no=" + no + ", color=" + color + ", seat=" + seat + ", fuel=" + fuel + ", price=" + price
				+ ", mileage=" + mileage + "]";
	}
}
