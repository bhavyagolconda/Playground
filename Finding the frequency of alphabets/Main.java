

import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuilder s1 = new StringBuilder(str);
        int n = s1.length();
        int a[] = new int[70]; 
        for(int i = 0; i < 25; i++){
            a[i] = 0;
        }
        for(int i = 0; i<n; i++)
        {
            if(s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z')
            {
                int offset = s1.charAt(i) - 'A';
                char ch = (char)('a' + offset);
                s1.setCharAt(i, ch);
            }
            if(s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
            {
                a[s1.charAt(i) - 'a']++;
            }  
        }
        for(int i = 0; i < n; i++)
        {
            if(a[s1.charAt(i) -'a'] != 0)
            {
                System.out.print(s1.charAt(i) +"" +a[s1.charAt(i)-'a'] + " ");
                a[s1.charAt(i) -'a'] = 0;
            }
        }
    }
}