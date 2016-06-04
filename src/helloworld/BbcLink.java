package helloworld;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BbcLink {

	public static void main(String[] args) {
		WebDriver diver=new FirefoxDriver();
		diver.manage().window().maximize();
		diver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		diver.get("http://www.bbc.com/");
		//diver.findElement(By.xpath("//*[@id='orb-nav-links']/ul/li[1]/a")).click();
		//diver.findElement(By.linkText("News")).click();
		diver.findElement(By.linkText("Weather")).click();
		//diver.findElement(By.xpath("//a[text()='News']")).click();
		
		//String res =diver.findElement(By.xpath("//a[text()='News']")).getAttribute("href");
		//System.out.println(res);
		//diver.findElement(By.partialLinkText("US author Harper")).click();
		diver.close();
	}

}
