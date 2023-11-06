package encapsulation;


public class Employee {
	public String name;
	private int Empid;
	public String deptname;
	protected String location;
	
	public int getEmpid()
	{
		return Empid;
	}
	public void setEmpid(int Empid)
	{
		this.Empid=Empid;
	}
	
	protected void display() {
		System.out.println("this is protucted class");
		
	}
	
	
	

}
