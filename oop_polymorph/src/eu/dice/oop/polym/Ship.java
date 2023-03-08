package eu.dice.oop.polym;

public class Ship extends Vehicle {
	private float capacity;
	private int regNo; //registration Number
	
	public Ship() {}
	
	public Ship(float weight, float capacity, int regNo) {
		super(weight);
		this.capacity=capacity;
		this.regNo=regNo;
	}

	public float getCapacity() {
		return capacity;
	}

	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	
	@Override //supradefinirea, aici e pus doar ca sa il vedem, in C# trb pus obligatoriu
	public String display() {
		return new String("Ship - w = " + this.getWeight() + ", capacity = " + this.capacity + ", regNo = " + this.regNo);
		//this e pus ca sa stim ca e adresa, merge si fara
	}

}
