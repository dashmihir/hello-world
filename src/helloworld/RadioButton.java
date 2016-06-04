package helloworld;

//import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://spicejet.com");
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).click();
		//driver.close();
//System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
	
//	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).click();
//	System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
//	driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
	int count=driver.findElements(By.xpath("//input[@type='radio']")).size();
	
		for(int i=0;i<count;i++){
			driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
		}
	}

}
