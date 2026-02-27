package day3.veh;
class Bank {

    void interest() {
        System.out.println("Bank provides interest on deposits🤑.");
    }

    void interest(double rate) {
        System.out.println("Interest rate is: " + rate + "%");
    }
}

class SBI extends Bank {

    void interest(double rate, int years) {
        int principal = 257360;
        		; 
        double totalInterest = (principal * rate * years) / 100;
        System.out.println("Total interest for " + years + " years is: " + totalInterest);
    }
}

public class bankingzz {
    public static void main(String[] args) {

        SBI s = new SBI();

        s.interest();           
        s.interest(5.7);        
        s.interest(5.7, 2);    
    }
}
	