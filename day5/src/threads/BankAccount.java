package threads;

public class BankAccount
{
    int balance=1000;
    void withdraw(int amount)
    {
        balance-=amount;
    }
    public static void main(String[] args) throws InterruptedException {
        BankAccount acc=new BankAccount();
        Thread t1=new Thread(() -> acc.withdraw(500));
        Thread t2=new Thread(() -> acc.withdraw(500));
        t1.start();
        t2.start();

        //t1.join();
        //t2.join();
        System.out.println("Final Balance: "+acc.balance);
        //join will make sure that main thread waits for the child threads to complete
    }
}
/*
Both the threads t1 and t2 access and modify same balance variable simultaneously
due to lack of synchronization the final balance becomes inconsistent

 */