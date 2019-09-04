import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
      boolean  leap;
      if(n%4==0)
      {
        if(n%100==0)
        {
           if(n%400==0)
           {
             leap=true;
           }
          else
          {
            leap=false;
          }
        }
        else
        {
          leap=true;
        }
      }
      else
      {
        leap=false;
      }
      if(leap == true)
      {
        System.out.println("Leap year");
      }
      else
      {
        System.out.println("Non Leap year");
      }
    }
}