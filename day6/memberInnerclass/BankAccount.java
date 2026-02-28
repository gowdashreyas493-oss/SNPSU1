package day6.memberInnerclass;
public class BankAccount {
    private double balance=10000;
    //Member class
    class Transaction{
        void withdraw(double amount){
            if(amount <= balance){
                balance -= amount;
                System.out.println("Withdrawn:"+ amount);
            }else {
                System.out.println("Not enough money");
            }
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        BankAccount.Transaction tx = bankAccount.new Transaction();
        tx.withdraw(3000);
        tx.withdraw(2000);
        System.out.println(bankAccount.balance);
    }
}
/*
! PTR:
* Transaction belongs to specific account
 */