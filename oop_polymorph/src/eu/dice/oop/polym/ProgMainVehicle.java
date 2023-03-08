package eu.dice.oop.polym;

public class ProgMainVehicle {

	public static void main(String[] args) {
		// 1. polymorphism pure
		// 2. class-cast exception
		// 3. interface as type
		
		
		//1.
		Vehicle v = null;
		Car c = new Car(1400, 5);
		Ship s = new Ship(15000, 100, 321);
		v = c;
		System.out.println(v.display());
		//peste 2000 de linii de cod
		v = s;
		System.out.println(v.display());
		
		//2.
		Vehicle v0 = null;
		v0 = c;
		try {
		s = (Ship)v0; 
		s.setCapacity(150);
		} catch(ClassCastException cce) {
			cce.printStackTrace();
		}
		//Rolul lui try-catch este ca instructiunile 
		//care urmeaza sa mearga
		
		//3.
		Movement mObj = new Car(2800, 5); 
		mObj.display();
		
		try (Car cObj  = new Car(3500, 3)){
			cObj.display();
			System.out.println("No Cars = " + Car.getNoCars());
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("No Cars = " + Car.getNoCars());
		
		//interfata e tip de data declarativ 
		
				
		System.out.println("main prog finished");
	}

}
