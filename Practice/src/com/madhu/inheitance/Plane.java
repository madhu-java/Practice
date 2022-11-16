package com.madhu.inheitance;

class Plane {

	public void takeOff() {
		System.out.println("plane is taking off");
	}

	public void fly() {
		System.out.println("plane is flying");
	}

	public void land() {
		System.out.println("plane is landing");
	}
	public static void main(String[] args) {
		CargoPlane cp= new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		cp.takeOff();
		cp.fly();
		cp.land();
		pp.takeOff();
		pp.fly();
		pp.land();
		
		}
}
class CargoPlane extends Plane{
	public void fly() {
		System.out.println("cargo plane flies at lower height");
	}
	public void cargoGoods() {
		System.out.println("cargo plane carries goods");
	}
}
class PassengerPlane extends Plane{
	public void fly() {
		System.out.println("passenger plane flies at medium height");
	}
	public void cargoGoods() {
		System.out.println("passenger plane carries passengers");
	}
}
class LaunchPlane{
//	public static void main(String[] args) {
//		CargoPlane cp= new CargoPlane();
//		PassengerPlane pp = new PassengerPlane();
//		cp.takeOff();
//		cp.fly();
//		cp.land();
//		pp.takeOff();
//		pp.fly();
//		pp.land();
//		
//		}
}
