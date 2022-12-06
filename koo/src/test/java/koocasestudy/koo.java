package koocasestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class koo {
	
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	@BeforeTest
	public void BeT() throws InterruptedException{
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://www.kooapp.com/feed");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	}
	@Test
	public void tc1() throws InterruptedException {
	test = extent.createTest("Checking the functionality of +koo module");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@class='_2VfDv']")).click();
	Thread.sleep(2000);
	}	
	@Test
	public void tc2() throws InterruptedException {
		test = extent.createTest("Checking the functionality of upload image option");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='koo-create-images-upload-component']")).click();
		Thread.sleep(5000);
		test.pass("user is able to upload image from pc");
	}
		@Test
		public void tc3() throws InterruptedException {
		test = extent.createTest("Checking the functionality of upload video option");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='koo-create-video-upload-component']")).click();
		Thread.sleep(5000);
		test.pass("user is able to upload video from pc");
		}
		@Test
		public void tc4() throws InterruptedException {
		test = extent.createTest("Checking the functionality of attach link option");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@title='Attach Link']")).click();
    	Thread.sleep(5000);
    	test.pass("user is able to attach link");
		}
		@Test
		public void tc5() throws InterruptedException {
		test = extent.createTest("Checking the functionality of create poll option");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@title='Create a poll']")).click();
		Thread.sleep(5000);
		test.pass("user is able to create poll");
		}
		@Test
		public void tc6() throws InterruptedException {
		test = extent.createTest("Checking the functionality of settings option");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@data-nimg='intrinsic']")).click();
		Thread.sleep(5000);
		test.pass("user is able to select settings option");
		}
		@Test
		public void tc7() throws InterruptedException {
		test = extent.createTest("Checking the functionality of language option");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='chakra-tabs__tab css-bubol0']")).click();
		Thread.sleep(5000);
		test.pass("user is able to select language option");
		}
		@Test
		public void tc8() throws InterruptedException {
		test = extent.createTest("Checking the functionality of post option");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='chakra-text css-m75dnw']")).click();
		Thread.sleep(5000);
		test.pass("user is able to select post option");
	}
	@ AfterTest
    
    public void t9() throws InterruptedException {
 	   driver.quit();
 	  extent.flush();
    
    }
}


