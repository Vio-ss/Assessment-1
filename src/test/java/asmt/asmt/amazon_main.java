package asmt.asmt;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.runtime.Runtime;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class amazon_main {
	WebDriver driver;
	@Given("user in home page")
	public void userHomepage() {
		System.setProperty("webdriver.chrome.driver","D:\\CD2\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	
	@When("user clicks on signin")
	public void checkSignin() {
		WebElement p=driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']"));
		p.click();

	}
	@Then("user enters details and continue")
	public void signinDetails(){
		WebElement user=driver.findElement(By.xpath("//input[@id='ap_email']"));
		user.sendKeys("swethassivasankaran@gmail.com");
		user.submit();
		WebElement pwd=driver.findElement(By.xpath("//input[@id='ap_password']"));
		pwd.sendKeys("Swetha123#");
		pwd.submit();		
	}
	@And("user in cart page")
	public void userCartpage() {
		WebElement p=driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
		p.click();
	}
	@When("user deletes cart items if present")
	public void checkCart() {
		WebElement deselect=driver.findElement(By.xpath("//a[@id='select-all']"));
		deselect.click();
		WebElement delete=driver.findElement(By.xpath("//a[@id='deselect-all']"));
		delete.click();
	}
	@And("user in products page")
	public void homePage() {
		WebElement p=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		p.click();
	}
	@When("user choose Electronics and headphone")
	public void chooseProduct() {
		WebElement menu=driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
		menu.click();
		
		WebElement electro=driver.findElement(By.xpath("//ul[17]//li[1]//a[1]"));
		electro.click();
		WebElement headphone=driver.findElement(By.xpath("//a[@class='hmenu-item'][normalize-space()='Headphones']"));
		headphone.click();
	}
	@And("user add top result to cart")
	public void topResultHead() {
		WebElement tophead=driver.findElement(By.xpath("//div[contains(@class,'apb-default-slot apb-default-merchandised-search-10')]//div[2]//div[1]//div[1]//div[1]//a[1]//img[1]"));
		tophead.click();
		WebElement headcart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		headcart.click();
	}
	@Then("user search macbook pro")
	public void chooseProductMac() {
		WebElement usersearch=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		usersearch.sendKeys("Macbook pro");
		usersearch.submit();
	}
	@And("user add second available item")
	public void secResultMac() {
		WebElement secmac=driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_2']//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']//span[1]"));
		secmac.click();
		WebElement seccart=driver.findElement(By.id("add-to-cart-button"));
		seccart.click();
	}
	@And("user return to cart page")
	public void returnCart() {
		WebElement p=driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
		p.click();
	}
	@When("user remove headphone and reduce macbook pro quantity")
	public void rmProduct() {
		WebElement rmhead=driver.findElement(By.xpath("//input[@name='submit.delete.2900596d-c203-4f41-a69b-5e55be3068aa']"));
		rmhead.click();
		WebElement selectquantity=driver.findElement(By.xpath("//div[@id='sc-active-Cf8aff541-7c79-4888-9349-d5a8c7b01dd4']//span[@class='a-button-text a-declarative']"));
		selectquantity.click();
		WebElement rmmac=driver.findElement(By.xpath("//div[@id='a-popover-3']//a[@id='quantity_4']"));
		rmmac.click();
	}
	@And("user click checkout")
	public void checkout() {
		WebElement select=driver.findElement(By.xpath("//a[@id='select-all']"));
		select.click();
		WebElement checkout=driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
		checkout.click();
	}
	@Then("user click account")
	public void cAccount() {
		// Locating the Main Menu (Parent element)
		WebElement mainMenu = driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']"));

		//Instantiating Actions class
		Actions actions = new Actions(driver);

		//Hovering on main menu
		actions.moveToElement(mainMenu);

		// Locating the element from Sub Menu
		WebElement subMenu = driver.findElement(By.xpath("//span[normalize-space()='Sign Out']"));

		//To mouseover on sub menu
		actions.moveToElement(subMenu);

		//build()- used to compile all the actions into a single step 
		actions.click().build().perform();
	}
	@And("user sign out")
	public void userSignOut() {
//		WebElement signout=driver.findElement(By.xpath("//span[normalize-space()='Sign Out']"));
//		signout.click();
	}
}
