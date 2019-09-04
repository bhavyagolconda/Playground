import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    int max=a[0];
    int p=0;
    for(int i=0;i<=n-1;i++)
    {
      if(max<a[i])
      {
        max=a[i];
        p=i;
      }
    }
    System.out.println(p);
    
    
  }
}