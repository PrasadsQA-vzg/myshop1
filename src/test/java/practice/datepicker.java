package practice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class datepicker {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
				
		driver.get("https://jqueryui.com/datepicker/");
				
		//Switching to the frame
				
	    driver.switchTo().frame(0);
				
		//Method1:By using sendKeys
				
		//driver.findElement(By.id("datepicker")).sendKeys("05/10/2025");
				
		//Method2:By using Date-picker
				
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.className("ui-icon-circle-triangle-e")).click();
		)
				
		String month = "June";
	    String year = "2025";
		String date = "18";
				
			while(true) {
					
		      String currentmnth = driver.findElement(By.className("ui-datepicker-month")).getText();
							
		      System.out.println(currentmnth);    //june
							
		      String currentyear =	driver.findElement(By.className("ui-datepicker-month")).getText();
							
		      System.out.println(currentyear);    //2025
							
				if(currentmnth.equals(month) && currentyear.equals(year)){
								
				  break;
								
				  }		
							
				}
							
				
	List<WebElement> alldates=driver.findElements(By.xpath("//table[@ class ='ui-datepicker-calendar']/tbody/tr/td"));
						
					
						for(WebElement dd : alldates) {
												
						if(dd.getText().equals(date)) {
														
							dd.click();
													}
												
											}

	}

}
