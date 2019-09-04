import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int l = s.length();
        double aDec = 0;
        double bDec = 0;
        int flag =0;
        for(int i = 0; i<l; i++)
        {
            if(s.charAt(i)=='.')
            flag = 1;
        }
        if(flag == 1)
        {
            for (int i = l - 1 ; s.charAt(i)!= '.' && i >= 0; i--)
            {
                aDec = aDec/10 + (s.charAt(i)-'0');
            }
            aDec = aDec/10;
            for (int i = 0 ; s.charAt(i)!= '.' ; i++)
            {
                bDec = bDec*10 + (s.charAt(i)-'0');
            }
        }
        else
        {
            for (int i = 0 ; i<l ; i++)
            {
                bDec = bDec*10 + (s.charAt(i)-'0');
            }
        }
        double sum = (aDec + bDec);
        System.out.printf("%.1f",sum);
    }
}