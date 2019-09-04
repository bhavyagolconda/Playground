import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      
 int num1,num2;
      Scanner s = new Scanner(System.in);
      num1=s.nextInt();
      num2=s.nextInt();
      if(num1 >num2)
      {
        System.out.println("num1 is the greatest number");
	}
      else
      {
        System.out.println("num2 is the greatest number");
      }
    }
}