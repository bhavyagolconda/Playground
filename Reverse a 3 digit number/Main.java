import java.util.Scanner;

class Main
{
  public static void main(String args[])
  {
    int a,rev=0;
    Scanner in =new Scanner(System.in);
      int num=in.nextInt();
     
    while(num!=0)
    {
      a=num%10;
      rev=(rev*10)+a;
      num=num/10;
    }
    System.out.println(rev);
    
  }
  }