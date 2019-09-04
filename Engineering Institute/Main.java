//import required packages
import java.util.Scanner;
class Faculty
{
  public void Salary(int bs)
  {
        System.out.println("Base Salary: " + bs);

  } 
  
 
}
 class CSE  extends Faculty{
  public void Salary(int bs)
  {
    
        System.out.println("CSE Faculty: " + (bs+3000));

  }
 }
class IT extends CSE
{
   public void Salary(int bs)
  {
   
        System.out.println("IT Faculty: " + (bs+5000));

  } 
}
class ECE extends  IT
{
   public void Salary(int  bs)
  {
   
        System.out.println("ECE Faculty: " + (bs+4500));

  } 
}

class Main
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int baseSalary = s.nextInt();
  Faculty f = new Faculty();     
    f.Salary( baseSalary);
    CSE c = new CSE();
    c.Salary(baseSalary);
    IT i = new IT();
    i.Salary(baseSalary);

    //implement your required concept here
    ECE obj = new ECE();
    obj.Salary(baseSalary);
  
    
  }
}