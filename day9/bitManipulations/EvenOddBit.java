package day9.bitManipulations;

import java.util.Scanner;

public class EvenOddBit {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n;
        Scanner sc=new Scanner(System.in );
        n=sc.nextInt();
        if((n&1)==0){
            System.out.println(n+" is Even");
        }else{
            System.out.println(n+" is ODD");
        }
    }
}
