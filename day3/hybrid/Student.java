package day3.hybrid;
interface Sports{
	void play();
}
class Person{
	String name;
	Person(String name){
		this.name=name;
	}
}
public class Student extends Person implements Sports {
	Student(String name){
		super(name);
	}
@Override
public void play() {
	System.out.println(name +" plays Cricket");
}
}
class Demo{
	public static void main(String[] args) {
		Student st=new Student("Shreyas");
		st.play();
		
	}
}