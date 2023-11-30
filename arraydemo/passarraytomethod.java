package arraydemo;

public class passarraytomethod {
	static void sum(int a[]) {
		int sum=0;
		
		//for(i=0;i<a.length;i++)
			for(int i:a)
			//sum=sum+a[i];
				sum=sum+i;
		System.out.println("addition no ="+sum);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,45};
		
				sum(a);
			}

		
	}

