import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner s = new Scanner(System.in);
      int size= s.nextInt();
      int a[]=new int[size];
    
      for(int i=0;i<size;i++)
      {
        a[i]=s.nextInt();
      }
        int search1=s.nextInt();
        int search2=s.nextInt();
      int element_1_index=-1;
      int element_2_index=-1;
      
      for(int i=0;i<size;i++)
      {
        if(search1==a[i])
        {
          element_1_index=i;
        }
      }
     for(int i=0;i<size;i++)
      {
        if(search2==a[i])
        {
          element_2_index=i;
        }
      }
      System.out.println(element_1_index);
      System.out.println(element_2_index);
       
        
}
}