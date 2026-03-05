package day7.Algorithms;

import java.util.Arrays;

public class CountSort {
    public static void countSort(int[]arr){
        int k = arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]>k){
                k=arr[i];
            }
        }
        int[]count=new int[k+1];
        //Step3:Calculate the freq of each element in the array
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //Step4:Calculate the cumulative frequency
        //Skip index 0 and start from 1 till max(k)
        for(int i=1;i<=k;i++){
            count[i]+=count[i-1];

        }
        // Step5: Create the output array
        int[] output=new int[arr.length];
        //Step6:Start from the end of the array(l<-r)
        for(int i=arr.length-1;i>=0;i--){
            output[--count[arr[i]]]=arr[i];

        }
        System.arraycopy(output,0,arr,0,arr.length);
    }

    public static void main(String[] args) {
        int[]arr={7,8,9,2,3,3,0,9,5,6};
        System.out.println(Arrays.toString(arr));
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
