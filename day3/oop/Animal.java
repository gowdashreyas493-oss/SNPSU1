package day3.oop;

public class Animal {
	void print() {
		System.out.println("sound");
	}
}
class cat extends Animal{
	void sound() {
		System.out.println("meow");
	}
	public static void main(String[]args) {
		cat c= new cat();
		c.print();
		c.sound();
		dog prashu=new dog();
		prashu.tulasi();
	}
}