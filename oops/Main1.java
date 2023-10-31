package oops;


class Bank{
	   String bankname;
	   String location;
	   double pincode;
	   Bank(String name , String loc, double pin) 
	   {
	        bankname=name;
	         location =loc;
	         pincode =pin;
	    }
	}
public class Main1{

    public static void main(String[] args) {
        Bank b= new Bank ("state bank" , "chennai", 600023);
  	    System.out.println("bank:"+b.bankname) ;
  	    System.out.println("loc:"+b.location) ;
    	System.out.println("regno:"+b.pincode); 
    }
}
