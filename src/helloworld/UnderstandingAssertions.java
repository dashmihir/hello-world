package helloworld;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.testng.Assert;

public class UnderstandingAssertions {
	@Rule
	public ErrorCollector ecollector=new ErrorCollector();
	@Test
	public  void testfacebookfriends(){
		int actualfriend=100;
		int expectedfriend=101;
	/*	if(actualfriend==expectedfriend){
		System.out.println("pass");
		}
		if(actualfriend!=expectedfriend){
		
			System.out.println("fail");
			} */
		System.out.println("A");
		try{
		Assert.assertEquals(actualfriend, expectedfriend);
		}catch(Throwable t){
			System.out.println("ERROR ENCOUNTERED");
			ecollector.addError(t);
			
					}
		System.out.println("B");
		try{
		Assert.assertEquals("A","B");
		}catch(Throwable t){
			System.out.println("ERROR ENCOUNTERED");
			ecollector.addError(t);
			
					}
		try{
			Assert.assertEquals("A","A");
			}catch(Throwable t){
				System.out.println("ERROR ENCOUNTERED");
				ecollector.addError(t);
				
						}
			
		}
	}


