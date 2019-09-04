import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     
      Scanner s = new Scanner(System.in);
      int n=s.nextInt();
      int[] a=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=s.nextInt();
      }
      int left=0;
      int right=n-1;
      boolean  matching=true;
      while(left<=right)
      {
        if(a[left]!=a[right])
        {
          matching=false;
          break;
        }
            left++;
            right--;
      }
      if(matching==true)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
            
    }
}