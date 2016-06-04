package helloworld;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RediffTable {
	static WebDriver driver;
	public static void main(String[] args) {
		String CompanyName="Bajaj Electrical";
		 driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		List<WebElement> CompanyNames=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> currentPrices=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("total company names "+  CompanyNames.size());
		System.out.println("total current price "+ currentPrices.size());
		for(int i=0;i<CompanyNames.size();i++)
		{
			if(CompanyName.equals(CompanyNames.get(i).getText())){
			System.out.println(CompanyNames.get(i).getText() +"....."+currentPrices.get(i).getText());
			break;
		}
		
	}
		int row=getRowWithCellData("30.05");
		System.out.println("present row no.  " +row);
	}
	public static int getRowWithCellData(String data){
		int rows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		int cols=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
		System.out.println("total rows are.." +rows);
		System.out.println("total cols are  "+cols);
		
		for(int rnum=1;rnum<=rows;rnum++){
			System.out.println("row is "+rnum);
			List<WebElement> rowcells=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr["+rnum+"]/td"));
			//System.out.println("total cells  "+rowcells.size());
			for(int cnum=0;cnum<=rowcells.size();cnum++){
				String text=rowcells.get(cnum).getText();
				System.out.print(text+".....");
				if(text.equals(data)){
					return rnum;
				}
			}
			System.out.println();
		
	}
		return 0;

}
}

