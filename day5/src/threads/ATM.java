package threads;

public class ATM  extends Thread{
    public void run(){
        System.out.println("Processing ATM transaction");
    }

    public static void main(String[] args) {
        ATM a=new ATM();
        System.out.println("Thread state:"+a.getState());//NEW
        a.start();
        System.out.println("Thread state after start:"+a.getState());//RUNNABLE
    }
}
