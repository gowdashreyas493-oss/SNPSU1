package threads;

public class DeadlockDemo {
    static final Object AccA= new Object();
    static final Object AccB= new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (AccA) {
                System.out.println("Thread 1 Locked Account A");
                try{
                    Thread.sleep(2000);
                }catch(Exception e){}
                synchronized (AccB) {
                    System.out.println("Thread 1 Locked Account B");
                }

            }
            });
        Thread t2 = new Thread(() -> {
            synchronized (AccB) {
                System.out.println("Thread 2 Locked Account B");
                synchronized (AccA) {
                    System.out.println("Thread 2 Locked Account A");
                    try{
                        Thread.sleep(2000);
                    }catch(Exception e){}
                }

            }

        });
        t1.start();
        t2.start();

    }
}
/*
Thread -1 acquires a lock an account A and then sleeps ,giving
Thread -2 acquires a lack on Account B Now Thread-1 waits for Account A and thread 2
waits for Account B Since neither thread releases the lock Both keep waiting and thus
creating a deadlock
! DEADLOCK exp:
Deadlock occurs when each thread is holding  a resource  and waiting for other to
release it
 */