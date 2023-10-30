package basicprograms;

public class Fibonacci{
	  public static void main(String args[]){
	   int a=0,b=1,c,i;
	   int n=10;
	   for (i=2;i<n;i++)
	   {   c=a+b;
	       a=b;
	       b=c;
	       System.out.println(c);
	   }
	}
	}