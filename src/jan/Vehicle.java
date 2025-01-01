//Create a program to demonstrate inheritance by extending a `Vehicle` class to `Car` and `Bike`.  

package jan;

public class Vehicle {
	public void manfYear(int year) {
		System.out.println("Manufacturing Year: "+year);
	}
	
	public static void main(String[] args) {
		Bike bk = new Bike();
		
		bk.manfYear(2009);
		bk.bikeName("Pulsar");
	}
}

class Car extends Vehicle{
	public void carName(String n) {
		System.out.println("Car name: "+n);
	}
}

class Bike extends Vehicle{
	public void bikeName(String n) {
		System.out.println("Car name: "+n);
	}
}