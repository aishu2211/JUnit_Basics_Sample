package test1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SecondTestCase {
	
	@Test
	public void SendmailTest(){
		System.out.println("Sending mail");
	}
	
	@Test
	public void SendMsgTest(){
		System.out.println("Sending message");
	}
	
	@Before
	public void openbrowser(){
		System.out.println("Opening Browser");
	}
	
	@After
	public void closebrowser(){
		System.out.println("Closing browser");
	}
	
	@BeforeClass//first function to be called
	//function must be static
	public static void beginning(){
		System.out.println("********beginning********");
		//Assume.assumeTrue(checklogin());
	}
	
	/*private static boolean checklogin() {
		return false;
		
	}*/

	@AfterClass
	//last function to be called
	//function must be static
	public static void ending(){
		System.out.println("********ending***********");
	}

}
