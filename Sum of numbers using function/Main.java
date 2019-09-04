import java.util.Scanner;
class Main{
  
  public static int SON(int num) //Sum Of Numbers(son)
  {
    int sum=0;
    for(int i=1;i<=num;i++)
    {
      sum=sum+i;
    }
    return sum;
  }
     
	public static void main (String[] args){
     Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int sum2=SON(n);
      System.out.println(sum2);
	} 
}
