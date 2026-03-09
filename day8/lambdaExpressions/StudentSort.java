package day8.lambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;

class Student{
    String name;
    int id;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
}
public class StudentSort {
    public static void main(String[] args) {
        ArrayList<Student>list=new ArrayList<>();
        list.add(new Student(100,"Shreyas"));
        list.add(new Student(124,"BOBZY"));
        list.add(new Student(074,"Prashu"));
        for(Student s:list){
            System.out.println(s.id+","+s.name);
        }
        Collections.sort(list,(s1, s2)->s1.id - s2.id);
        for(Student s: list){
            System.out.println(s.id+","+s.name);
        }
    }
}
