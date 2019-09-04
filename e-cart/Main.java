//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  public int getPrice()
  {
    return price;
  }
  public void setPrice(int price)
  {
    this.price=price;
  }

  //create various method to return attribute value(s)
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
  public String getProduct()
  {
    return product;
  }
  public void setProduct(String product)
  {
    this.product=product;
  }
  public void setQuantity(int quantity)
  {
    this.quantity=quantity;
  }
   public int getQuantity()
  {
    return quantity;
  }
}

class Bill
{
  //implement your logic to calculate total price
 	 public void Bill( int price,int quantity)
  	{
       int Totalprice = price*quantity;
       System.out.println("Total Price is : " + Totalprice);
       
    }
}
class Main
{
  public static void main(String[] args)
  {
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    //write the logic here
    Scanner s = new Scanner(System.in);
    String product = s.nextLine();
    int price = s.nextInt();
    int quantity = s.nextInt();
    c.setQuantity(quantity);
    c.setProduct(product);
    i.setPrice(price);
    obj.Bill(price,quantity);
      
  }
}