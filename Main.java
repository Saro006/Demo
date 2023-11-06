package encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.name="saravanan";
		e1.deptname="ece";
		e1.location="chennai";
		e1.setEmpid(1234);
		
		System.out.println(e1.name);
		System.out.println(e1.deptname);
		System.out.println(e1.location);
		System.out.println(e1.getEmpid());

	}

	}


