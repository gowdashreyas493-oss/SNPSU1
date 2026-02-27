package day3.hybrid;

public interface Cat {
	default void sound() {
		System.out.println("MEOW");
	}

}
interface dog{
	default void sound() {
		System.out.println("who let the dogs out ");
	}
}
class Cog implements Cat,dog{
	public void sound() {
		dog.super.sound();
	}
}
class Dem {
	public static void main(String[] args) {
		Cog c = new Cog();
		c.sound();
	}
}