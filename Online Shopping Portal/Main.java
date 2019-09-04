public class Main {
	public static void main(String[] args) {
		//write the logic for the main function
      Customers c1 = new Customers(1001,"Saakshi",9000000000l,"Bangalore",
                                   "16-jul-1990",'F',
                                   "lakme kajal,salwar");
      Customers c2=new Customers(1008,"Rahul",9000000001l,"chennai",
                                 "27-jan-1992",'M',
                                "T-Shirt,Jeans");
      Suppliers s1=new Suppliers(7901,"ABC Traders",8000000000l,
                                 "Mumbai",10,"Paid",4.75);
     Suppliers s2=new Suppliers(7972,"XYZ Enterprises",8000000900l,
                                "Kolkata",7,"Unpaid",4.35);

         c1.displayProfileDetails();  
          c2.displayProfileDetails();      
          s1.displayProfileDetails();  
          s2.displayProfileDetails();  


     c1.editAddress("Coimbatore");
      s1.editAddress("Delhi");
      
      c1.placeOrder();
      
      s1.increaseStockLevel(5);
      s2.increaseStockLevel(10);

      
    }	
}

class Users {
		//write the logic for the class Users	   
  int id;
  String name;
  Long  mobileno;
  String Address;

  
  public void editAddress(String newAddress)
  {
    System.out.println(name+", " +Address);
    Address=newAddress;
    System.out.println(name+", " +Address);

  }
   public void displayProfileDetails()
      {
      System.out.println(name +", "+ mobileno);
      }
   
}

class Customers extends Users{
		//write the logic for the class Customers	
  String dateofbirth;
   char gender;
  String  orderhistory;
  
  public Customers( int id, String name, Long  mobileno,String Address,
                   String dateofbirth,char gender, String orderhistory)
  {
    this.id=id;
    this.name=name;
    this.mobileno=mobileno;
    this.Address=Address;
    this.dateofbirth=dateofbirth;
    this.gender=gender;
    this.orderhistory=orderhistory;
  }
    
 

   
  public void placeOrder()
  {
    System.out.println("Order placed successfully!");
  }
  
  
}

class Suppliers extends Users {
		//write the logic for the class Suppliers
  int itemstock;
   String paymentstatus;
  double feedbackrating;
    public Suppliers( int id, String name, Long  mobileno,String Address,
                   int itemstock,   
                     String paymentstatus,  double feedbackrating)
    {
      this.id=id;
      this.name=name;
      this.mobileno=mobileno;
      this.Address=Address;
      this.itemstock=itemstock;
      this.paymentstatus=paymentstatus;
      this.feedbackrating=feedbackrating;
    }

  
	  public void increaseStockLevel(int stock)
  		{
        System.out.println(name+", "+ (itemstock+stock));
        }
    

}