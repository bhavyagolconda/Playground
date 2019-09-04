import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i= 0; i <= n - 1; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        // Sorting the given array and printing the kth largest number
        selection_sort(n, a);
        System.out.println(a[n-k]);
    }
    public static void selection_sort(int n, int a[]){
        for(int s = 0; s <= n - 2; s++)
        {
            int m= find_minimun_idx(s, a, n-1);
            swap(s, m, a);
        }
    }
     public static void swap(int s, int m, int a[]){
         int temp = a[s];
         a[s] = a[m];
         a[m] = temp;
     }
     public static int find_minimun_idx(int s, int a[], int e){
         int m = 0;
         if(a[s] < a[s + 1])
         {
             m = s;
         }
         else{
             m= s + 1;
         }
         for(int i = s + 2; i <= e; i++){
             if(a[m] > a[i])
             {
                 m = i;
             }
         }
         return m;
     }
}