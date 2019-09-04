import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code hereanne
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int[]  a = new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=s.nextInt();
      }
      Subset(n,a);
    }
  public static void Subset(int n,int a[])
  {
    for(int i=0;i<=n-2;i++)
    {
      for(int j=i+1;j<=(n-1);j++)
      {
        for( int k=j+1;k<=(n-1);k++)
        {
          System.out.print("("+a[i]+","+" "+a[j]+","+" "+a[k]+")"+" ");
        }
      }
      System.out.println("");
    }
  }
}
