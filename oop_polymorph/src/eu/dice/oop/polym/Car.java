package eu.dice.oop.polym;

public class Car extends Vehicle implements Cloneable, AutoCloseable { //mostenesc din Vehicle
//Movement e implementat intrinsec
	//AutoClosable este un fel de a forta destructorul
	
	private static int noCars; //camp static pt a gestiona cate obiecte am creat din acea clasa
	private int doorsNo;
	
	public Car() {
		Car.noCars++; //merge si noCars++
	}
	
	public Car(float weight, int doorsNo) {
		super(weight); //preia din clasa de baza
		///this.weight= ??? - NU MERGE!
		this.doorsNo=doorsNo;
		Car.noCars++;
	}
	
	public int getDoorsNo() {
		return doorsNo;
	}

	public void setDoorsNo(int doorsNo) {
		this.doorsNo = doorsNo;
	}

	public static int getNoCars() {
		return noCars;
	}
	
	@Override
	public void close() throws Exception{
		Car.noCars--; //se comporta ca destructor
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Car rc = null;
		rc = (Car)super.clone();
		rc.doorsNo = this.doorsNo;
		Car.noCars++; //este alegerea mea daca implementez nr de obiecte
		return rc;
	}
	
	@Override //supradefinirea, aici e pus doar ca sa il vedem, in C# trb pus obligatoriu
	public String display() {
		return new String("Car - w = " + this.getWeight() + ", doorsNo = " + this.doorsNo);
	}
}
