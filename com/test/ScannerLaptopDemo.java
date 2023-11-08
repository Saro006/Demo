package com.test;
import java .util.*;
public class ScannerLaptopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1 for addition");
		System.out.println("2 for substraction");
		System.out.println("3 for multiply");
		System.out.println("4 for find odd or even");
		int givenNumber=sc.nextInt();
		do {
			if(givenNumber==1) {
				System.out.println("to provide two numbers for addition");
			
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println(a+b);
				System.out.println("Give an option to perform operation");
				givenNumber=sc.nextInt();
				continue;
			}
			else if(givenNumber==2) {
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println(a-b);
				System.out.println("Give an option to perform operation");
				
			}
			else if(givenNumber==3) {
				System.out.println("Provide Two Numbers to Perform Multiplication");
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println(a*b);
				System.out.println("Give an option to perform operation");
				givenNumber=sc.nextInt();
				continue;
			}
			
			else if(givenNumber==4) {
				System.out.println("Provide One Number to Find Odd or Even");
				int a=sc.nextInt();
				if(a%2==0) {
					System.out.println("Given Number is Even");
				}
				else {
					System.out.println("Given Number id Odd");
				}
				System.out.println("Give an option to perform operation");
				givenNumber=sc.nextInt();
				continue;
			}
			else if(givenNumber==5) {
				System.out.println("Terminating Operation....");
				break;
			}
			else {
				System.out.println("Please provide 1 to 4 And 5 Terminate the operation");
				System.out.println("Give an option to perform operation");
				givenNumber=sc.nextInt();
				continue;
			}
		}while(true);
		sc.close();
	}
}
				
	
		

