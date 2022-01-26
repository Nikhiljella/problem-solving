package service;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {

    /*
    *
        int matrix[][] = {{5,11,30},{5,19,19}};
        int matrix[][] = {{5,11},{30,5},{19,19}};
        SpiralTraverse.spirallyTraverse(matrix,3,2);
    * */

    private static ArrayList<Integer> right( int sample[][],int matrix[][], int r, int c, int round, ArrayList<Integer> result)
    {
        int i = round;
        while( i< c )
        {
            if (sample[round][i] != 1)
                result.add(matrix[round][i]);
            sample[round][i] = 1;
            i++;
        }
        return result;
    }

    private static ArrayList<Integer> down( int sample[][],int matrix[][], int r, int c, int round, ArrayList<Integer> result)
    {
        int i = round;
        while( i < r )
        {
            if(sample[i][c-round-1] != 1)
                result.add(matrix[i][c-round-1]);
            sample[i][c-round-1] = 1;
            i++;
        }
        return result;
    }

    private static ArrayList<Integer> left( int sample[][],int matrix[][], int r, int c, int round, ArrayList<Integer> result)
    {
        int i = c - round -1;
        while( i > -1 )
        {
            if (sample[r - round -1][i] != 1)
                result.add(matrix[r - round -1][i]);
            sample[r - round -1][i] = 1;
            i--;
        }
        return result;
    }

    private static ArrayList<Integer> up( int sample[][],int matrix[][], int r, int c, int round, ArrayList<Integer> result)
    {
        int i = r - round - 1;
        while( i > -1 )
        {
            if (sample[i][round] != 1)
                result.add(matrix[i][round]);
            sample[i][round] = 1;
            i--;
        }
        System.out.println(result);
        return result;
    }




    public static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int sample[][] = new int[r][c];

        for (int i = 0; i < ((Math.min(r, c)%2) == 0 ? Math.min(r, c)/2 : (Math.min(r, c)/2 + 1) )  ; i++)
        {
            result = right(sample,matrix,r,c,i,result);
            result = down(sample,matrix,r,c,i,result);
            result = left(sample,matrix,r,c,i,result);
            result = up(sample,matrix,r,c,i,result);
        }
        return result;
    }
}
