import java.util.Scanner;
class Main{
	public static void main (String[] args){
Scanner s  = new Scanner(System.in);
      int n = s.nextInt();
      int copy=n;
      int sum=0;
      while(n>0)
      {
              int fact=1;

        int rem = n%10;
      for(int i=rem;i>0;i--)
      {
        fact = fact*i;
    }
        sum =sum+fact;
        n=n/10;
      }
      if(sum == copy){
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
}
}