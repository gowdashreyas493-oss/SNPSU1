public class Strong{
    int factorial(int d){
        int fact=1;
        for(int i=1;i<=d;i++){
            fact=fact*i;
        }
        return fact;
    }
    boolean isStrong(int n){
        int temp=n;
        int sum=0;
        while(n!=0){
            int d=n%10;
            sum+=factorial(d);
            n=n/10;
        }
        if(sum==temp){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[]args){
        Strong st=new Strong();
        if(st.isStrong(145)){
            System.out.println("STRONG");
        }else{
            System.out.println("NOT Strong");
        }
    }
}