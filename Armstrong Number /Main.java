import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int copy = n;
      int digits=0;
      if (n==0)
      {
        System.out.println(n);
      }
      else
      {
         while(n>0)
         {
           digits++;
           n=n/10;
         }
      }
      n=copy;
      int sum=0;
      while(n>0)
      {
      int rem=n%10;
        int pow=1;
       for(int i=0;i<digits;i++)
       {
        pow=pow*rem;
       }
       sum =sum+pow;
        n=n/10;
      }
      if(sum == copy)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
        
       
	}
}