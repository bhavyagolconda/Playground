import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i <= n - 1; i++){
            a[i] = sc.nextInt();
        }
        int f[] = new int[k];
        for(int i = 0; i <= k - 1; i++)
        {
            f[i] = 0;
        }
        for(int i = 0; i<= n - 1; i++){
           f[a[i] - 1]++;
        }
        for(int i = 0; i <= k - 1; i++){
           System.out.println((i + 1) + " " + f[i]);
        }
    }
}