import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code hereb.length
      Scanner s = new Scanner(System.in);
      String ch = s.nextLine();
      StringBuilder sb = new StringBuilder(ch);
      int n = sb.length();
      int[] a=new int[26];
      for(int i=0;i<26;i++)
      {
        a[i]=0;
      }
      
      for(int i=0;i<n;i++)
      {
        if(sb.charAt(i)>='a' && sb.charAt(i)<='z')
        {
          a[sb.charAt(i)-'a']++;
        }
        if(sb.charAt(i)>='A' && sb.charAt(i)<='Z')
        {
          a[sb.charAt(i)-'A']++;
        }
      }
       for(int i=0;i<26;i++)
      {
                if(a[i]==0)
                {
                  char miss=(char)(i+'a');
                           System.out.print(miss + " ");

                }
       }

      }
      
   
}