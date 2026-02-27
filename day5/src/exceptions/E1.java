package exceptions;

public class E1 {
    public static void main(String[] args) {
        int i ,j,k=0;
        i=10;
        j=10;
        try {
            k=i/j;
            int[]arr={1,2,3,4,5};
            System.out.println(arr[9]);
       }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
            e.printStackTrace();//Details of the exception
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Array index");
            e.printStackTrace();


        }catch (Exception e){
            System.out.println("Something unexpected :");
        }finally {
            System.out.println("End of execution");
        }

        System.out.println("value of k "+k);
    }

static{
    System.out.println("Start execution");
}}
