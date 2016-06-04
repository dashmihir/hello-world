package helloworld;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableCricket {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		driver.get("http://www.espncricinfo.com/ci/engine/match/415281.html"); 
	WebElement table=	driver.findElement(By.xpath("//*[@class='batting-table innings']"));
	List<WebElement> noofRows=table.findElements(By.tagName("tr"));
	System.out.println("no.of rows   " +noofRows.size());
	int i=0;
	//no. of columns in each row
	for(WebElement eachrow :noofRows)
	{
		List<WebElement> eachColumn=eachrow.findElements(By.tagName("td"));
		i++;
		System.out.println("no. of columns in " +i+ "th row are " +eachColumn.size());
		for(WebElement text:eachColumn){
			System.out.println(text.getText());
		}
	}
	
		

	}

}
