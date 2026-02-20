public class Student{
    String name;
    int age;
    Student(String n, int a){
        name=n;
        age=a;
    }
    void display(){
        System.out.println(name+" "+age);
    }
    public static void main(String[]args){
        Student st=new Student("Shreyas",100);
        st.display();
    }
}