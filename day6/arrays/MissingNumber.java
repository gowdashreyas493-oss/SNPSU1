package day6.arrays;

public class MissingNumber {
    public static int missingNumber(int[] arr){
        int n =arr.length+1;
        int totalsum=(n*(n+1))/2;
        int arraysum=0;
        for(int i=0;i<arr.length;i++){
            arraysum+=arr[i];
        }
        return totalsum-arraysum;
    }

    public static void main(String[] args) {
        int[]arr={1,2,4,5};
        System.out.println(missingNumber(arr));
    }
}
