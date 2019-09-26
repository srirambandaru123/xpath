package xpathpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingdynamicwebtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		// //*[@id="content"]/table/tbody/tr[1]/td[3]
		// //*[@id="content"]/table/tbody/tr[2]/td[3]
		// //*[@id="content"]/table/tbody/tr[3]/td[3]
		
		String after_xpath = "]/td[3]";
		String before_xpath = "//*[@id='content']/table/tbody/tr[";
		for (int i=1;i<=4;i++){
			String actualxpath=before_xpath+i+after_xpath;
			WebElement kunfu=driver.findElement(By.xpath(actualxpath));
			System.out.println(kunfu.getText());
			if(kunfu.getText().contains("509m")){
				System.out.println("height:"+kunfu.getText()+"is found"+i);
				break;
			}
			
			
		//WebElement element=driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[3]"));
		//System.out.println(element.getText());
		
		
		
		
		
		
		
		}
	
		
		
		

	}}



