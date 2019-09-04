import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int [] a= new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=s.nextInt();
    }
      int value=s.nextInt();
      Pair(n,a,value);
    }
     
  public static void Pair(int n,int a[],int value)
  {
    for(int i=0;i<n;i++)
    {
      for( int j=i;j<=n-1;j++)
      {
  
        if(a[i]+a[j] == value)
        {
          System.out.println(a[i]+","+" "+a[j]);
        }
      }
    }
  }
}