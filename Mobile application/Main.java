class MyModel1 {
     //write your logic here
  int Camera=2;
  public MyModel1()
  {
    System.out.println("Features of MyModel 1");
    System.out.println("Camera mega pixels: "+Camera);
  
}
}
class MyModel2 extends MyModel1 {
     //write your logic here
  int Camerapixels=5;
  String lock="Fingerprint";
  int Size=5;
  public MyModel2()
  {
        System.out.println("Features of MyModel 2");
        System.out.println("Camera mega pixels: "+Camerapixels);
        System.out.println("Lock mechanism: "+lock);
        System.out.println("Display size: "+Size);
  }
}
class MyModel2T extends MyModel2 {
     //write your logic here
  int Camerapixels1=16;
  String lock="Fingerprint";
  int Size=6;
 
 public MyModel2T()
  {
        System.out.println("Features of MyModel 2T");
        System.out.println("Camera mega pixels: "+Camerapixels1);
        System.out.println("Lock mechanism: "+lock);
        System.out.println("Display size: "+Size);
 }
}
public class Main 
{
    public static void main(String[] args) 
    {
          //write your logic here
      MyModel2T m = new MyModel2T();
    }
}