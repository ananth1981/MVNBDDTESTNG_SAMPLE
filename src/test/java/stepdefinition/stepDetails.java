package stepdefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class stepDetails {
public static WebDriver driver;


@Given("^Lauch TNEB portal$")
    public void lauch_tneb_portal() throws Throwable {
   	  // System Property for Chrome Driver   
	    System.setProperty("webdriver.chrome.driver", "E:\\STUDY\\selenium\\Drivers\\chromedriver.exe");
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
           // Launch Website  
        driver.get("http://tneb.tnebnet.org/newlt/consbillstatus.html");  
         //Maximize the browser  
          driver.manage().window().maximize();  
          driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
      	Thread.sleep(2000);
    }

@When("^Region of the Service$")
public void region_of_the_service() throws Throwable {
    	Thread.sleep(500);
//
//System.out.println("Title of the page is:::: " +driver.getTitle()); 
////    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
////
////Select region = new Select(driver.findElement(By.xpath("//select[@id='code']")));
////     	 region.selectByIndex(9);
//    	//region.selectByValue("9. Chennai South (South, West & Chengalpattu EDC)");
//    	
	System.out.println("When");
    }


    @Then("^Enter from service number in three fields$")
    public void enter_from_service_number_in_three_fields() throws Throwable {
      	Thread.sleep(2000);
//    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//    	driver.findElement(By.name("sec")).sendKeys("580");
//    	driver.findElement(By.name("dist")).sendKeys("002");
//    	driver.findElement(By.name("serno")).sendKeys("755");
    	System.out.println("THNE1");
    }

    @Then("^Enter Mobile Number$")
    public void enter_mobile_number() throws Throwable {
//      	Thread.sleep(2000);
//      	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//    	driver.findElement(By.name("mob")).sendKeys("111");
    	System.out.println("THNE2");
    }

    @Then("^enter Capcha$")
    public void enter_capcha() throws Throwable {
//      	Thread.sleep(2000);
//    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//    	driver.findElement(By.xpath("//*[@id=\"6_letters_code\"]")).sendKeys("755");
//    	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);	
    	System.out.println("Then3");
    }

    @Then("^Click Proceed Button$")
    public void click_proceed_button() throws Throwable {
//      	Thread.sleep(2000);
//      	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
//    	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
//    	driver.findElement(By.name("proceed")).click();
    	System.out.println("THNE4");
    }

    @And("^Displaying Current Month EB Bill details$")
    public void displaying_current_month_eb_bill_details() throws Throwable {
    	Thread.sleep(10000);
      	System.out.println("And");
    	driver.quit();
    }

}
