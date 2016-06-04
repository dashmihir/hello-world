package helloworld;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBox {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
	driver.get("http://gmail.com");
	//File ScrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(ScrFile, new File("D:\\xyz.jpg"));
	
	
	/*		driver.findElement(By.id("Email")).sendKeys("archanamishra2000@gmail.com");
		String text=driver.findElement(By.id("Email")).getAttribute("placeholder");
		System.out.println("text  "+text);
		text=driver.findElement(By.name("signIn")).getAttribute("value");
		System.out.println(text);
		driver.close(); */
	/*	driver.get("http://qtpselenium.com/home/contact_trainer");
		driver.findElement(By.name("country_id")).sendKeys("Albania");
		List<WebElement> options=driver.findElements(By.tagName("option"));
		System.out.println("total options are  "+options.size()); */

	}

}
