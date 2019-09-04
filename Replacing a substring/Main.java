import java.util.Scanner;
class Main{
 
 public static void main(String[] args) 
  { 
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        String s3 = scan.nextLine();
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);
        StringBuilder sb3 = new StringBuilder(s3);
        StringBuilder temp = new StringBuilder("");
        int n1 = sb1.length();
        int n2 = sb2.length();
        int n3 = sb3.length();
   		int i, j;
        for(i = 0; i <= (n1 - 1) - (n2 - 1); i++)
        {
            boolean is_matching = true;
            for(j = 0; j < n2; j++)
            {
                if(sb1.charAt(i + j) != sb2.charAt(j))
                {
                    is_matching = false;
                }
            }
            if(is_matching == true)
            {
              String strng = sb3.substring(0, n3);
              temp.append(strng);
              i = i + (n2 - 1);
            }
            else
            {
                char ch = sb1.charAt(i);
                temp.append(ch);
            }
        }
        for(j = i ; j <= (n1 - 1); j++)
        {
                char ch = sb1.charAt(j);
                temp.append(ch);
        }
        System.out.print(temp);
    }
}

