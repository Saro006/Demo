package arraydemo;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee[]=new Employee[3];
		employee[0]=new Employee(07,"dhoni","chennai");
		employee[1]=new Employee(18,"virat","bengalore");
		employee[2]=new Employee(8,"jadeja","chennai");
		for(Employee i:employee) {
			System.out.println(i.id+" "+i.name+" "+i.loc);
		}
          
          
	}

}
