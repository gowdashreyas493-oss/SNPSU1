package automorphic;
import java.util.*;

public class prg1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        int sqr = n * n;
        int temp = n;

        while (temp > 0) {
            if (temp % 10 != sqr % 10) {
                System.out.println(n + " is Not an Automorphic Number");
                return;
            }
            temp /= 10;
            sqr /= 10;
        }

        System.out.println(n + " is an Automorphic Number");
        sc.close();
    }
}