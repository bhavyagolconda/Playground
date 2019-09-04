import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[20];
        int i, j;
        for(i=0; i<N; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print(sum_subsequence( a, N ) );
    }
    public static int sum_subsequence( int a[], int n )
    {
        int rsum, mssub, i;
  
 	    rsum = a[0];
  	    mssub = a[0];
  	    for(i = 1; i < n; i++)
        {
            if(a[i] > a[i-1])
            {
                rsum += a[i];
            }
            else 
            {
                rsum = a[i];
            }
            if(rsum > mssub)
            {
                mssub = rsum;
            }
        }
        return mssub;
    }
}