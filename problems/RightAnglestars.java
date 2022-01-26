package service;

import java.util.Scanner;

public class RightAnglestars {

    void rightAngleStars()
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i < t+1; i++) {
            System.out.println("Case #" + i + ":");
            int n = sc.nextInt();
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    if(n-(k+j+1) <= 0)
                    {
                        System.out.print("*");
                    }
                    else System.out.print(" ");
                }
                System.out.println("");
            }

        }
    }
}
