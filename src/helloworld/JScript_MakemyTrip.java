package helloworld;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JScript_MakemyTrip {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.makemytrip.com/");
		List<WebElement> allradios=driver.findElements(By.xpath("//*[@class='radio_state']"));
		System.out.println("Total no. of radios " +allradios.size());
		allradios.get(0).click();

	}

}
