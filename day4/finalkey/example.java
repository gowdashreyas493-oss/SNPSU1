package day4.finalkey;

public class example {
    // if we don't initialize a static final variable , where is it initialized?=Constructor
    final int x;
    static final int y;
    example(){
        x=200;
    }

    public static void main(String[] args) {
        //object is mandatory for IIB output
    }
    static {
        y=10;
        System.out.println("DEVIL");
    }
}
