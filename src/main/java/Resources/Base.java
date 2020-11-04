package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public WebDriver driver;
	
	public Properties pr;
	public WebDriver initializedriver() throws IOException
	{
		pr=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Acer\\eclipse-workspace\\E2EProject\\src\\main\\java\\Resources\\Data.Properties");
		pr.load(fis);
		
		String platform=pr.getProperty("Browser");
	
		
		
		if(platform.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else if(platform.equals("firefoe"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
}
