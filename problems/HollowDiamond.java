package service;

public class HollowDiamond {

    public void printHollowDiamond(int sizeOfDiamond)
    {
        int max = sizeOfDiamond/2+1;
        int min = sizeOfDiamond/2;
        for(int i=0;i<max;i++)
        {
            for(int j=0;j<sizeOfDiamond;j++)
            {
                if(j == (max-i-1) || sizeOfDiamond-j == (max-i) )
                {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println("");
        }
        for(int i=min;i>0;i--)
        {
            for(int j=0;j<sizeOfDiamond;j++)
            {
                if(j == (max-i) || sizeOfDiamond-j-1 == (max-i) )
                {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
