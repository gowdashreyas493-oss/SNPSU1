package threads;

public class SafeBankAccount
{
    int balance=1000;
    synchronized void withdraw(int amount)
    {
        balance-=amount;
    }
    public static void main(String[] args) throws InterruptedException {
        SafeBankAccount acc=new SafeBankAccount();
        Thread t1=new Thread(() -> acc.withdraw(500));
        Thread t2=new Thread(() -> acc.withdraw(500));
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Final Balance: "+acc.balance);
        //join will make sure that main thread waits for the child threads to complete
    }
}
/*
code explanation
the synchronized keyword ensures that only one thread can execute the withdraw()
operation at a time preventing RACE condition and ensuring correct balance deduction
PTR:
* Synchronisation avoids RACE condn
* locks critical section in an application
* slower but safe
* Essential for shared resources
 */

