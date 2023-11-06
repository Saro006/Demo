package encapsulation.bank;

public class Acccount {
	private int acno;
	private int ifsccode;
	protected String location;
	protected String address;
	
	double amount;
	
	
	public int getacno()
	{
		return acno;
	}
	public void setacno(int acno) {
        this.acno =acno ;
        
	}
	
	 public int getifscode() {
	        return ifsccode;
	    }
	  public void setifsccode(int ifsccode) {
	       this.ifsccode = ifsccode;
	    }
	
	
	protected void info() {
		System.out.println("this is message");
		
	}
	
	 public static void main(String[] args) {
	        Acccount a1 = new Acccount();
	        a1.setacno(7345);
	        a1.setifsccode(2718);
	        a1.getacno();
	        a1.getifscode();
	        System.out.println("Account Number: " + a1.getacno());
	        System.out.println("IFSC Code: " + a1.getifscode());
	        System.out.println("Amount: " + a1.amount);
	    }
	}

