import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner in =new Scanner(System.in);
      int a=in.nextInt();
      
      int first=a/100;
      int last=a%10;
      System.out.println(first+last);
                      
	}
}