package day3.inheritance;

public interface Browser{
void browser();
}

interface browser1{
void browser1();
}

interface browser2{
void browser2();
}

class Browsers implements Browser,browser1,browser2{

@Override
public void browser(){
System.out.println("Google Chrome");
}

@Override
public void browser1(){
System.out.println("Mozilla Firefox");
}

@Override
public void browser2(){
System.out.println("Microsoft Edge");
}
}

class Demo{
public static void main(String[]args){
Browsers b=new Browsers();
b.browser();
b.browser1();
b.browser2();
}
}