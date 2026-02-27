package day4.finalkey;

public final class Demo {
}
//class A extends Demo -- final class cannot be inherited
class B{
    final void college(){                       //-- final method cannot be overidden
        System.out.println("SNPSU");
    }
}
class C extends B{
    final int x= 200;// cannot be changed
    void show(final int x){

    }


}