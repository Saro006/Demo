package oops;


class Add{
	
	
	public int add(int a,int b) {
		return a+b;
	}
	 public int add(int a,int b,int c) {
		 return a+b+c;
	 }

}

public class Main2 {

	public static void main(String[] args) {
	 Add a1=new Add();
	 int result1=a1.add(5, 6);
	 int result2=a1.add(5,6,7);
     System.out.println (result1);
     System.out.println(result2);
     
     
     

	}

}
