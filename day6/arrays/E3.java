package day6.arrays;

public class E3
{
    public static void main(String[] args)
    {
        //types
        int[] arr = {1, 2, 3, 4, 5};//10
        //2D -> array of arrays-matrix
        int[][] matrix = {{1, 2, 3},//row 0
                {4, 5, 6},//row 1
                {7, 8, 9} //row 2 [3x3] Square matrix
        };
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        //jagged array
        //in a 2D array if the row length is not same
        int[][] jagged = {
                {1, 2, 3, 4, 5},
                {1, 2},
                {1}
        };
        System.out.println(jagged[0].length);
        System.out.println(jagged[1].length);
        System.out.println(jagged[2].length);
        for (int r = 0; r < jagged.length; r++)
        {
            for (int c = 0; c < jagged[r].length; c++)
            {
                System.out.print(jagged[r][c] + " ");
            }
            System.out.println();
        }
        for(int[] a:jagged)
        {
            for(int x:a)
            {
                System.out.print(x+" ");
            }
            System.out.println();
        }

    }
}
