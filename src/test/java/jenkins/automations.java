package jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automations {

	public static void main(String[] args) {
		WebDriver wb=new ChromeDriver();
		wb.get("https://www.flipkart.com/");
WebElement tt=wb.findElement(By.xpath("//*[@name=\"q\"]"));
tt.sendKeys("tshirts");
tt.sendKeys(Keys.ENTER);
	}

}
