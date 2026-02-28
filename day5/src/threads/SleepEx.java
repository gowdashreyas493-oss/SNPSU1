package threads;

public class SleepEx {
    public static void main(String[] args)throws InterruptedException {
        System.out.println("printing 0-9");
        for(int i =0;i<10;i++){
            System.out.println(i);
            Thread.sleep(200);
        }
        System.out.println("done");
    }


}
