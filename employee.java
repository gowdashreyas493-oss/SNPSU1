package Employee;

public class employee {
	int id;
	String name;
	double sal;
   employee(int ID, String n,double salary){
	   id=ID;
	   name=n;
	   sal=salary;
   }
   void display() {
	   System.out.println("NAME:" +name+ " ID:" +id + " SALARY:" +sal);
   }
   public static void main(String[]args) {
	   employee em=new employee(100,"Shreyas",5757.5757);
	   employee em1=new employee(91,"SATHU",3.3);
	   em.display();
	   em1.display();
   }
}
