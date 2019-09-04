import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner s = new Scanner(System.in);
      int n=s.nextInt();
      int[] a= new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=s.nextInt();
      }
      int missing=0;
     for(int value=1;value<n;value++)
     {
       boolean found=false;
       for(int i=0;i<=n-1;i++)
       {
         if(a[i] == value)
         {
           found=true;
           break;
         }
       }
        if(found == false)
         {
           missing=value;
         break;
        }
       
     }
             System.out.println(missing);

    }
}