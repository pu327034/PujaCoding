package webAutomation;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait; 
public class MKS {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		  driver=new FirefoxDriver(); 
		  driver.get("http://mksinfo.in");
		  driver.manage().window().maximize(); 
	      WebDriverWait wait = new WebDriverWait(driver, 10);
	      wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Login")));
	      driver.findElement(By.linkText("Login")).click();
	      WebElement element2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("work")));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
	      Select dropdown = new Select(driver.findElement(By.id("work")));
	      dropdown.selectByVisibleText("E-MAIL SENDING");
	      WebElement element1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("userid")));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
	      driver.findElement(By.name("userid")).sendKeys("mks573");
	      driver.findElement(By.name("password")).sendKeys("mks573");
	      wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Button1")));
	      driver.findElement(By.id("Button1")).click();
	      driver.findElement(By.linkText("SENT MAIL")).click();
	     
	     //Taking data from file
	     try {
	            FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Downloads\\6.xlsx");
	            XSSFWorkbook wb = new XSSFWorkbook(fis);
	            XSSFSheet sheet = wb.getSheet("sheet1");
	            for(int count=1;count<=sheet.getLastRowNum();count++)
	            {
	                XSSFRow row = sheet.getRow(count);
	                System.out.println("Running test case " + count);
	                int res=runTest(row.getCell(0).toString());
	                if(res==1)
	                break;
	            }
	            driver.findElement(By.linkText("LOGOUT")).click();
	            
	           
	        }
	     catch (IOException e) {
	            System.out.println("Test data file not found"); }   
	    
	}
	 public static int runTest(String mailid) throws InterruptedException 
     {
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		 try {
			Thread.sleep(1000);
			 driver.findElement(By.xpath("/html/body/form/div[4]/div/div/div/div/div[1]/div/table/tbody/tr/td[2]/div/fieldset/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[1]/input")).clear();
			 System.out.println("Clear");
		} catch (InterruptedException e) {
			Thread.sleep(4000);
			//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/form/div[4]/div/div/div/div/div[1]/div/table/tbody/tr/td[2]/div/fieldset/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[1]/input")).clear();
			 System.out.println("Catch clear");
		}
		 
		 try {
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/form/div[4]/div/div/div/div/div[1]/div/table/tbody/tr/td[2]/div/fieldset/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[1]/input")).sendKeys(mailid);
			 System.out.println("Enter");
		} catch (InterruptedException e) {
			Thread.sleep(3000);
			//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/form/div[4]/div/div/div/div/div[1]/div/table/tbody/tr/td[2]/div/fieldset/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[1]/input")).sendKeys(mailid);
			 System.out.println("Catch Enter");
		}
		 try {
			Thread.sleep(2000);
			 driver.findElement(By.xpath("/html/body/form/div[4]/div/div/div/div/div[1]/div/table/tbody/tr/td[2]/div/fieldset/table/tbody/tr[3]/td[2]/table/tbody/tr[5]/td[2]/input")).click();
			 System.out.println("Click Send");
		} catch (InterruptedException e) {
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/form/div[4]/div/div/div/div/div[1]/div/table/tbody/tr/td[2]/div/fieldset/table/tbody/tr[3]/td[2]/table/tbody/tr[5]/td[2]/input")).click();
			 System.out.println("Catch Click Send");
		}
		
    	 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	 if(driver.findElement(By.xpath("/html/body/form/div[4]/div/div/div/div/div[1]/div/table/tbody/tr/td[2]/div/fieldset/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[4]/span")).getText().toString().equals("0"))
    	 {
    		 System.out.println("100 mails sent");
    		 
    		 return 1;
    	 }
    	 return 0;
     }
}
