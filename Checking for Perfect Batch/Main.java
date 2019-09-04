import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner s = new Scanner(System.in);
    int n =s.nextInt(); 
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
   int batch=a[0]+a[1]+a[2];
    int cur=0;
    for(int i =3;i<n;i=i+3)
    { 
     cur = a[i]+a[i+1]+a[i+2];
  }
    if(batch == cur)
    {
      System.out.println("Perfect Batch");
    }
    else
    {
      System.out.println("Not a Perfect Batch");
    }
  }
}