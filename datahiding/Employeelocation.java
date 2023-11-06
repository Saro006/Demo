package encapsulation.datahiding;

import encapsulation.Employee;

class EmployeeLocation extends Employee{
		    public static void main(String[] args) {
		        EmployeeLocation x = new EmployeeLocation();
		        x.location = "Mysore";
		        System.out.println("Employee Location: " + x.location);
		        x.display();
		    
		}

	}


