package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.client.Main;
import com.lti.model.Flight;

public class TestCase1 {
	// below @test is compulsory
	@Test
	public void testAdd()
	{
		int a = 10, b = 20;
		assertEquals(30, Main.add(a, b));
	}
	@Test
	public void testNums()
	{
		int a=10,b=20;
		//assertTrue(Main.compare(a, b));
		assertFalse(Main.compare(a, b));
	}
	@Test
	public void testObjectes()
	{
		Flight f1= new Flight(2, "Vellore", "Chennai");
		Flight f2= new Flight(2,"Vellore","Chennai");
		assertSame("Objects are not equal",f1, f2);//Checks the reference
//		assertEquals("Objects are not equal",f1, f2);
	}
	
}
