package eu.dice.oop.polym;

public class Vehicle extends Object implements Movement, Cloneable {
	//add unimplemented methods
	private float weight;
	
	public Vehicle() {}
	
	public Vehicle(float weight) {
		this.weight=weight; //this-> de la c++
	}
	
	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public void startEngine() {
		System.out.println("Vehicle::start");
		
	}

	@Override
	public void stopEngine() {
		System.out.println("Vehicle::stop");
	}

	@Override
	public String display() {
//		String rez = new String("Vehicle - w = " + this.weight);
//		return rez;
		return new String("Vehicle - w = " + this.weight);
	}

	//aici este deep copy 
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Vehicle rv = null;
		rv = (Vehicle)super.clone();//echivalent cu base din C#, adica preia din clasa parinte
		rv.weight = this.weight;
		return rv;
	}
	
}
