package test1;

import org.junit.Ignore;
import org.junit.Test;

public class FirstTestCase {
	
	@Test
	public void logintest(){
		System.out.println("Login test");
	}
	
	@Ignore   //To skip test
	@Test
	public void registertest(){
		System.out.println("Register test");
	}
	
	@Test
	public void databasetest(){
		System.out.println("Database test");
	}
	
}
