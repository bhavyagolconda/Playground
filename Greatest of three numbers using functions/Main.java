import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here1
      Scanner s = new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      int n4=Greatest(n1,n2);
      System.out.println(Greatest(n3,n4));
	}
  public static int Greatest(int g1,int g2)
  {
    int n4=0;
    if(g1>g2)
    {
      n4=g1;
    }
    else
    {
      n4=g2;
    }
    return n4;
  }
}