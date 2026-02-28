package day6.anonymousInnerclass;

public interface Payment {
    void pay();
}
class PayementDemo{
    public static void main(String[] args) {
        Payment p= new Payment() {

            public void pay() {
                System.out.println("Payment done using Credit Credit Card");

            }
        };
        p.pay();
        Payment p1= () -> System.out.println("cash payment");
        p1.pay();
    }
}