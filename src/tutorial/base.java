package tutorial;


import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		String[] itemsNeeded= {"Cucumber", "Brocolli"};
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++)
		{
			String name=products.get(i).getText();
			
			List al=Arrays.asList(itemsNeeded);
			
			if(al.contains(name))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			}
		}
	}

}
