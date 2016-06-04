package helloworld;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterisedTestcase {
	
	public String username;
	public String password;
	public int pin;
	
	public ParameterisedTestcase(String username,String password,int pin){
		this.username=username;
		this.password=password;
		this.pin=pin;
		
	}

	
	@Parameters
	public static Collection<Object[]> getdata(){
		Object[][] data=new Object[2][3];
		data[0][0]="user1";
		data[0][1]="pass1";
		data[0][2]=234;
		
		data[1][0]="user2";
		data[1][1]="pass2";
		data[1][2]=2345;
		
		return Arrays.asList(data);
	}
		
		@Test
		public void testRegister(){
			System.out.println("testing resgistration"+ username +".........."+ password +"....."+pin);
			System.out.println("a");
		}
		
		
		
	
	

}
