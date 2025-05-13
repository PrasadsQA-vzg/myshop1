package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
		  WebElement email= driver.findElement(By.id("email_create"));
		  
		     
			JavascriptExecutor js = (JavascriptExecutor)driver;
			/*js.executeScript("arguments[0].setAttribute('value','naga348@test.com')", email);
			WebElement click = driver.findElement(By.id("SubmitCreate"));
			js.executeScript("arguments[0].click()",click);
			//scrollbar is not a part of application by using javascript executor we can move the scrollbar up and down
            // there are 3 ways to scrollbar down
			//1.pixel number
			//2.we can scroll down till webelement is visble based on the condtion
			//3.till end of the page*/
			//js.executeScript("window.scrollBy(0,150)","");
		    //System.out.println(js.executeScript("returnwindow.pageYoffset;"));
		    
		   // WebElement news = driver.findElement(By.id("newsletter-input"));
		   // js.executeScript("arguments[0].scrollIntoView();",news);
		    
		    js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		    
		    Thread.sleep(3000);
		    
		    js.executeScript("window.scrollTo(0,-document.body.scrollHeight);");
			
	}

}
