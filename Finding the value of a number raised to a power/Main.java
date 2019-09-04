import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner s = new Scanner(System.in);
      int base = s.nextInt();
        int exponent = s.nextInt();
      int res=1;
      while(exponent !=0)
      {
        res *=base;
        --exponent;
      }
      System.out.println(res);
    }
}