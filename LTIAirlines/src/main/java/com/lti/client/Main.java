package com.lti.client;

import com.lti.model.Flight;

public class Main {

	public static void main(String[] args) {
//		Flight f = new Flight(1,"Chennai","Vellore");
//		System.out.println(f.getFlightId()+" "+f.getSource()+" "+f.getDestination());
//		//Test data
		int a=10,b=30;
		if(add(a,b) == 30)
		{
			System.out.println("Test pass");
		}
		else
			System.out.println("Test fails");
	}
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static boolean compare(int a,int b)
	{
		if(a==b)
			return true;
		else
			return false;
	}
}
