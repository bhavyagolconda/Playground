import java.util.Scanner;
class Main
{
    public static void main(String args[])    
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        int f[] = new int[n];
        int idx = relement(a,n,f);
        int max = max_index(f,n,idx);
        System.out.print(max);
    }
    public static int relement(int a[], int n, int f[])
    {
        int i;
        int count=0;
        int freq_idx = 0;
        for(i = 0; i < n ; i++)
        {
            if(a[i] == 1)
            {
                count++;
            }
            if((a[i] == 0) || (i == n-1))
            {
                f[freq_idx] = count;
                count = 0;
                freq_idx++;
            }
        }
        return freq_idx-1;
    }
    public static int max_index(int f[], int n, int idx)
    {
        int max_no = 0;
        if((f[0] > f[1]) || (idx == 0))
        {
            max_no = f[0];
        }
        else
        {
            max_no = f[1];
        }
        for(int i = 2; i < idx ; i++)
        {
            if(max_no < f[idx])
            { 
                max_no = f[idx];
            }
        }
    return max_no;
    }
}
