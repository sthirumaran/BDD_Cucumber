package tc_implementation;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_implementation {

	public static WebDriver driver;
	
    
	@Given("^Open chrome browser and enter url$")
	public void open_chrome_browser_and_enter_url() throws Throwable 
	{
		Properties prop= new Properties();
		FileInputStream stream = new FileInputStream("C:\\Users\\hp\\BDD_Project\\src\\main\\resources\\browser-config.properties");
		prop.load(stream);
	
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\OneDrive\\Documents\\Eclipse\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(3000);	
		driver.manage().window().maximize();			
		driver.get(prop.getProperty("browser.baseURL"));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 	   
	}

	@When("^Enter search creteria$")
	public void enter_search_creteria() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id='search'][@class='style-scope ytd-masthead']")).sendKeys("Test");
		Thread.sleep(2000);	 	    
	}

	@Then("^Click on search button$")
	public void click_on_search_button() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id='search-icon-legacy']")).click();
		Thread.sleep(12000);	 	
		driver.quit();
	}

}