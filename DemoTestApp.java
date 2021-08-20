package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTestApp {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "c:\\driver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt"
				);
		d.switchTo().frame("iframeResult");
		WebElement we = d.findElement(By.xpath("//button[text()='Try it']"));
		System.out.println(we);
		we.click();
		
	}

	}
       
