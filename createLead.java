package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver ();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");


		driver.findElement(By.id("password")).sendKeys("crmsfa");


		driver.findElement(By.className("decorativeSubmit")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("CRM/SFA")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("Leads")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("Create Lead")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Pellucid");

		Thread.sleep(2000);

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nivedhitha");

		Thread.sleep(2000);

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Devaraj");

		Thread.sleep(2000);

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nivi");

		Thread.sleep(2000);


		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");

		Thread.sleep(2000);

		driver.findElement(By.id("createLeadForm_description")).sendKeys("manual testing");


		Thread.sleep(2000);

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Nivi@pellinc.com");

		WebElement ele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

		Select state = new Select(ele);

		state.selectByVisibleText("New York");

		Thread.sleep(2000);

		driver.findElement(By.name("submitButton")).click();

		Thread.sleep(2000);

		System.out.println("The page Title is "+ driver.getTitle());

		driver.close();

	}

}
