package oops_Inheritance;

public class BMW extends Car{
	@Override
	public void start() {
		System.out.println("Bmw start....");
	}
	public void autoPark() {
		System.out.println("BMW autopart");
	}
	@Override
	public void gear() {
		System.out.println("automatic gearing in BMW");
	}
	//@Override
//	public static void refuel() {
//		System.out.println("Bmw refuel");
//	}
	


}
