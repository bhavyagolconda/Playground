import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner in =new Scanner(System.in);
      int a=in.nextInt();
      
      int n=a/10;
      int q=a%10;
      System.out.println(n+q);
	}
}