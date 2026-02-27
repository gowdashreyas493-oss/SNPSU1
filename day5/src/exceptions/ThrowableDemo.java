package exceptions;

public class ThrowableDemo {
    static void test()throws Throwable{
        throw new Throwable("something went wrong");
    }

    public static void main(String[] args) {
        try{
            test();
        }catch(Throwable t){

            System.out.println("handled:"+t);
            System.out.println("\nHandled:"+t.getMessage());
        }
    }
}
/*
throw new String("error");❌
throw new Integer("Error");❌
throw new Throwable("error");✅
 */
