package supermethod;

public class Student extends Person{
	String name="saro";
	String course="java";
	
	Student(){
		super();
		
	
	}
	
	public void message() {
		System.out.println(name+""+course);
		
	}
	
	public void display() {
		
		super.display();
		
		
		
	}

}
