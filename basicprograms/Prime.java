package basicprograms;

public class Prime {

	public static void main(String[] args) {
		int n=6,i;
		int f=0;
		for(i=1;i<=n;i++) {
			if(n%i==0) {
				f++;
			}
		}
		if(f==2) {
			System.out.print(n+"is prime");
	}
		else
			System.out.println(n+"is not prime");
			

}
}