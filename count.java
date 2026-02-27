import java.util.*;
public class count
{
    public static void main(String[] args) 
    {
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        n=sc.nextInt();
        while(n>0)
        {
            n=n/10;
            count++;
            sc.close();
        }
        System.out.println(count);
    }
}
