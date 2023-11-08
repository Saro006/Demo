package com.Abstract;

public class Customer implements Vechicleabstract,CARINTERFACE{


	@Override
	public void carfeatures() {
		// TODO Auto-generated method stub
		System.out.println("Bike is milageable vechicle");
		
	}

	@Override
	public void bikefeatures() {
		// TODO Auto-generated method stub
		System.out.println("Car is luxurious");
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer();
		c1.bikefeatures();
		c1.carfeatures();

	}

}
