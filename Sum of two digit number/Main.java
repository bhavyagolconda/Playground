import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int n1;
      int sum=0;
      Scanner s = new Scanner(System.in);
      n1 =s.nextInt();
      while(n1>0)
      {
        int p = n1%10;
        sum=sum+p;
        n1=n1/10;
      }
      System.out.println(sum);
	}
}