package helloworld;

import org.junit.Ignore;
import org.junit.Test;

public class FirstJunit {
	
		@Test
		public void logintest(){
			System.out.println("Testing an app");
		}
		@Ignore
		@Test
		public void registertest(){
			System.out.println("registring user");
			
		}
		@Test
		public void databaseTest(){
			System.out.println("database testing");
		}
		
	

}
