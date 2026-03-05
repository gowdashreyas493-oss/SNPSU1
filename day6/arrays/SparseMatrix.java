package day6.arrays;

public class SparseMatrix {
    public static void main(String[] args) {
        int[][]matrix={
            {0,0,3},
            {0,0,0},{4,0,0}
        };
        int rows= matrix.length;
        int cols= matrix[0].length;
        int zerocount=0;
        int nonZeroCount=0;
        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    zerocount++;
                }else{
                    nonZeroCount++;
                }
            }
        }
        System.out.println("Zeros: "+zerocount);
        System.out.println("Non Zeros: "+ nonZeroCount);
        System.out.println(zerocount>nonZeroCount ?"Sparse":"Not Sparse");
    }
}
