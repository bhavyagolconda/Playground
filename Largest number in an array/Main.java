
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      int n ,max;
     
      Scanner s = new Scanner(System.in);
      int size=s.nextInt();
      int a[]=new int[size];
      for(int i=0;i<size;i++)
      {
         a[i]=s.nextInt();
      }
      max=a[0];
      for(int i=0;i<size;i++)
      {
        if(max <a[i])
        {
          max=a[i];
        }
      }
      System.out.println(max);
      
 
    }
}
