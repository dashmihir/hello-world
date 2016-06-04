package helloworld;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class SecondTest {

	@BeforeClass
	public static void begin(){
		System.out.println("******BEGIN*******");
	}
	@AfterClass
	public static void end(){
		System.out.println("...........end........");
	}
	


	@Before
	public void openBrowser(){
		System.out.println("open");
	}
	@Test
	public void sendEmailTest(){
		System.out.println("sending email");
	}
	@Test
	public void sendMsgTest(){
		System.out.println("sendng msg");
	}
	@After
	public void closeBrowser(){
		System.out.println("close");
	}
		
	
}

