package day6.arrays;



public class E2
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(arr[1]);
        arr[1]=40;
        System.out.println(arr[1]);
        //Access & update elements in an array -> TC 0(1)
        //this is because of index_based access or
        //direct index-mapping
        //[idx=pos-1] or [pos=idx+1]
        for(int i=0;i< arr.length;i++) //arr.length is a property not a function or method
        {
            System.out.print(arr[1]+" ");
        }
        System.out.println();
        for(int x : arr)
        {
            System.out.print(x+ " ");
        }
        System.out.println();
        for(Object o:arr)
        {
            System.out.print(o+" ");
        }
        System.out.println();
        String name="Java";
        System.out.println(name.length());//length() method
    }
}
/*
* array.length is a property
* string.length() is a method
* memory management
*
* ➡️Memory Management
        Array object is stored in the Heap.
        Variable reference is stored in the stack.
        Elements are stored in contiguous memory blocks.
        char[1][1][
 */