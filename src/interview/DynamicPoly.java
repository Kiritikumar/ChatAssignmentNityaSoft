package interview;

class Bike{
	public static void vehcle() {
		System.out.println("bike is running");
	}
}
class Car extends Bike{
	public static void vehcle() {
		System.out.println("Car is running");
	}
}
public class DynamicPoly {
public static void main(String args[]) {
	Bike b=new Car();
	b.vehcle();
	
	b=new Bike();
	b.vehcle();
}
}