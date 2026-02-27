package day3.veh;
class Vehicle{
	void speed() {
		System.out.println("The vehicle is LORD ALTO");
	}
	void speed(int maxspeed) {
		System.out.println("The vehicle's max speed is :"+maxspeed);
	}
}
class Car extends Vehicle{
	void speed(String mode) {
		System.out.println("Driving Mode:"+mode);
	}
}
public class veh {
 public static void main(String[] args) {
	Car c= new Car();
	c.speed();
	c.speed(189);
	c.speed("Sport");
}

}
