package com.base.io;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver browserLaunch(String browser ) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe" );
					
					
		driver=new ChromeDriver();
			
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir")+"\\Drivers\\IEdriverserver.exe");
			driver=new InternetExplorerDriver();
	}
		
		
		driver.manage().window().maximize();
		return driver;
	}
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static void navTo(String url) throws InterruptedException {
		driver.navigate().to(url);
		Thread.sleep(3000);
	}
	public static void navBack() {
		driver.navigate().back();
	}
	public static void navForward() {
		driver.navigate().forward();
	}
	public static void navRefresh() {
		driver.navigate().refresh();
	}
	public static void get(String url) {
		driver.get(url);
	}
	public static Alert alert;
	public static void alert(String name) {
		alert= driver.switchTo().alert();
		if (name.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		}
		else if (name.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		}
		else if (name.equalsIgnoreCase("gettext")) {
			driver.switchTo().alert().getText();
		}
		
	}
	public static void alertSendkeys(String name) {
		driver.switchTo().alert().sendKeys(name);
	}
	public static Actions ac;
	public static void actions(WebElement element,String name) {
		ac=new Actions(driver);
		if (name.equalsIgnoreCase("place")) {
			ac.moveToElement(element).build().perform();
		}
		else if (name.equalsIgnoreCase("c")) {
			//ac.moveToElement(element).click().build().perform();
			ac.click(element).build().perform();
		}
		else if (name.equalsIgnoreCase("ctc")) {
			ac.contextClick(element).build().perform();
			
		}
		else if (name.equalsIgnoreCase("dc")) {
			ac.doubleClick(element).build().perform();
		}
	}
	public static void actionsDragAndDrop(WebElement source,WebElement Target) {
		ac =new Actions(driver);
		ac.dragAndDrop(source, Target).build().perform();
	}
	
	public static void frame(WebElement element) {
		driver.switchTo().frame(element);
	}
	public static void frameDefault() {
		
		driver.switchTo().defaultContent();
	}
	public static void clickOfElement(WebElement element) {
		element.click();

	}
	public static void inputValue(WebElement element, String s) {
		element.sendKeys(s);
		
	}
	public static Robot r;
	
	public static void robot(String n) throws AWTException, InterruptedException {
		 r=new Robot(); 
		 if (n.equalsIgnoreCase("ctc0")) {
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(3000);
			}
		 else if (n.equalsIgnoreCase("ctc1")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
		}
		else if (n.equalsIgnoreCase("ctc2")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
		} 
		else if (n.equalsIgnoreCase("ctc3")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
		} 
		else if (n.equalsIgnoreCase("ctc4")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
		} 
		else if (n.equalsIgnoreCase("ctc5")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
		} 
		else if (n.equalsIgnoreCase("ctc6")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
		} 
		else if (n.equalsIgnoreCase("ctc7")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
		} 
		else if (n.equalsIgnoreCase("ctc8")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
		} 
		else if (n.equalsIgnoreCase("ctc9")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
		} 
		else if (n.equalsIgnoreCase("ctc10")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
		} 
		else if (n.equalsIgnoreCase("ctc11")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
		} 
		else if (n.equalsIgnoreCase("ctc12")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
		} 
		
	}
	public static void windowsGetTitle() {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String all : windowHandles) {
			String title = driver.switchTo().window(all).getTitle();
			System.out.println(title);
		}
	}
	public static void multiWindowHandles(String n) throws AWTException, InterruptedException {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String Allchildwindow : windowHandles) {
			if (driver.switchTo().window(Allchildwindow).getTitle().equals(n)) {
				break;
			}
			driver.close();
		}
		
	}
	public static void singleWindowHandle() {
		String mainwindow = driver.getWindowHandle();
		Set<String> se = driver.getWindowHandles();
		Iterator<String> i2 = se.iterator();
		while (i2.hasNext()) {
			String childwindow = i2.next();
			if (!mainwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
			}}
	}
	public  static void mainWindow() {
		String mainwindow = driver.getWindowHandle();
		driver.switchTo().window(mainwindow);
	}
	public static Select s;
	public static void isSelect(WebElement element,String value) {
		s= new Select(element);
		s.selectByVisibleText(value);

	}
	
	public static void isMultipleselect(WebElement element,String value,String value2, String value3 ) {
		s=new Select(element);
		s.selectByVisibleText(value);
		s.selectByVisibleText(value2);
		s.selectByVisibleText(value3);

	}
	public static void getOptions(WebElement element ) {
		s=new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement alloptions : options) {
			System.out.println("Alloptions:"+alloptions.getText());
		}
		
	}
	public static void getFirstoptions(WebElement element) {
		s=new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("Firstoptions:"+firstSelectedOption.getText());
		
	}
	public static void getText(WebElement element) {
		s=new Select(element);
		
		System.out.println("'Text:"+element.getText());
		
	}
	
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Currenturl :"+currentUrl);
	}
	
	public static void getAllSelectedOptions(WebElement element) {
		s=new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement Allselectedoption : allSelectedOptions) {
			System.out.println("Allselectedoptions:"+Allselectedoption.getText());
		}
	}
	public static void isEnable(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println("Enable or not :"+enabled);
	}
	public static void getTittle() {
		String title = driver.getTitle();
		System.out.println("Tittle:"+title);
	}
	
	public static void isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println("Displayed or not"+displayed);
	}
	public static void takeSnap(String path) throws IOException {
		try {
			Thread.sleep(3000);
			TakesScreenshot ts=(TakesScreenshot) driver;
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			File destination =new File(path);
			FileUtils.copyFile(screenshotAs, destination);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	public static JavascriptExecutor js;
	public static void scroll(String name, String windowscrollBy) throws InterruptedException {
		js= (JavascriptExecutor) driver;
		if (name.equalsIgnoreCase("vertical")) {
			js.executeScript(windowscrollBy);
			Thread.sleep(3000);
		}
		else if (name.equalsIgnoreCase("end")) {
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(3000);
		}
		
	}
	
	public static void scrollToElement(WebElement element) {
		js.executeScript("arugments[0].scrollIntoView();", element);
		
	}
	
	public static void scrollEnd() throws InterruptedException {
		js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}
	public static WebDriverWait wait;
	public static void implicit() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	public static void explicit(WebElement element) {
		 wait = new WebDriverWait(driver, 5);
		 wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void fluent() {
		wait=(WebDriverWait) new FluentWait(driver);
		wait.withTimeout(20, TimeUnit.SECONDS);
		
		
	}
	public static void deleteAllCookies() {
		driver.manage().deleteAllCookies();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}