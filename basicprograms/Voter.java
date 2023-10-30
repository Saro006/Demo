package basicprograms;

public class Voter {

	public static void main(String[] args) {
		int age=19;
		if (age>=16 && age<=18) {
			System.out.println("voter not eligible");
			}
		else if(age<=15) {
			System.out.println("voter not eligible");
		}
		else if (age>=18) {
			System.out.println("voter are eligible");
		}
	
		

	}

}