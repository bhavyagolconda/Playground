import java.util.Scanner;
class Main
{
   public static int Square(int side)
   { 
     int res;
     res= side*side;
     return res;
   }
	public static void main (String[] args)
    {
	 Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int Square_of_Num=Square(n);
      System.out.println(Square_of_Num);
	} 
}