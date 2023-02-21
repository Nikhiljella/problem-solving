public class SmallestNumber1 {

    public static void main(String args[])
    {
        int n = 81000;
        int arr[] = smallestNumber1(n);
        String res = "";
        for(int i = 0; i< arr.length;i++)
        {
            if(arr[i] > 0)
            {
                int j = arr[i];
                while(j > 0)
                {
                    res = res + String.valueOf(i);
                    j--;
                }
            }
            System.out.print(arr[i]);
        }
        System.out.println(res);
        System.out.println("Hello, World!");
    }

    private static int[] smallestNumber1(int n) {
        int arr[] = new int[10];
        int i = 9;
        while ( i > 1)
        {
            if(n % i == 0)
            {
                n = n / i;
                arr[i]++;
            }
            else
                i--;
        }

        return arr;
    }

}
