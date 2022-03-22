package utilities;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Condition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Linkfile implements Methodsrequ {

	
	
	public WebDriver driver;



	@Override
	public void impwait(WebDriver driver, int num) {//driver not in parameter
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(num));
	}

	@Override
	public void pageld(WebDriver driver,int num) {//driver not in parameter
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(num));
	}
		

	@Override
public void textcap(WebElement ele) {
			System.out.println(ele.getText());
	
	
}
	@Override
	public void softasrt(boolean cond) {

	SoftAssert sft= new SoftAssert();
	sft.assertTrue(cond);
	
	}

	
	
	
	@Override
	public void newin(WebDriver driver) {
		driver.findElement(By.linkText("url2")).sendKeys(Keys.CONTROL + "t");
	}

	@Override
	public boolean Elemtvisi(WebDriver driver, int time, WebElement element) {
		boolean flag = false;
		try {
			WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(time));
			w1.until(ExpectedConditions.visibilityOf(element));
			flag = true;
			return flag;
		} catch (Exception e) {
			return flag;
		}
	}

	@Override
	public boolean Elemtclkble(WebDriver driver, int time, WebElement element) {
		boolean flag = false;
		try {
			WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(time));
			w1.until(ExpectedConditions.elementToBeClickable(element));
			flag = true;
			return flag;
		} catch (Exception e) {
			return flag;
		}
	}

	@Override
	public boolean alrtprest(WebDriver driver, int time) {
		boolean flag = false;
		try {
			WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(time));
			w1.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert();
			return flag;
		} catch (Exception e) {
			return flag;
		}
	}

	@Override
	public void frameswit(WebDriver driver, WebElement element, int time) {
		try {
			if (Elemtvisi(driver, time, element)) {

				driver.switchTo().frame(element);
			} else {
				System.out.println("No Frame is present");
			}
		} catch (Exception e) {

		}
	}

	@Override
	public void axismove(WebDriver driver, int A, int B) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.scrollBy(A,B)");
	}

	@Override
	public void scrollview(WebDriver driver, WebElement element) {
		// Find the element from selenium webdriver==> WebElement loginBtn =
		// driver.findElement(By.id("login"));
		// Find the element from javascript==>String javascript =
		// "arguments[0].scrollIntoView()";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("arguments[0].scrollIntoview()", element);
	}

	@Override
	public void moveatend(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.scrollTo(0,document.body.scrollHeight)", element);
	}

	@Override
	public void senddata(WebDriver driver, String s) {
		Actions act = new Actions(driver);
		act.sendKeys(s);
	}

	@Override
	public void actclkdata(WebDriver driver) {
		Actions act = new Actions(driver);
		act.click();
	}

	@Override
	public void drgdrp(WebElement Sourceele, WebElement targetele) {
		Actions act = new Actions(driver);
		act.dragAndDrop(Sourceele, targetele).build().perform();
	}

	@Override
	public void mousehover(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}

	@Override
	public String tittle(WebDriver driver) {
		String Title = driver.getTitle();
		System.out.println("The title is ::" + Title);
		return Title;
	}

	@Override
	public void chkboxbyvalwithnotext(WebElement element, String inp) {

		Select sct = new Select(element);
		List<WebElement> opts = sct.getOptions();
		int optsize = opts.size();
		for (int i = 0; i < optsize; i++) {
			String val=opts.get(i).getAttribute("value");

			if(val.equalsIgnoreCase(inp)) {
			sct.selectByValue(val);}
			}
		}
	

	@Override
	public void slctbyindx(WebElement element, int optval) {
		Select sct = new Select(element);
		sct.selectByIndex(optval);
	}

	@Override
	public void mulwind(WebDriver driver) {
		String MW = driver.getWindowHandle();
		Set<String> windw = driver.getWindowHandles();
		Iterator<String> it = windw.iterator();
		while (it.hasNext()) {
			String CW = it.next();
			if (!MW.equals(CW)) {
				driver.switchTo().window(CW);
				String Title = tittle(driver);
				driver.close();
			}
			driver.switchTo().window(MW);
			String MWTitle = tittle(driver);
		}
	}

	@Override
	public void closcurrpage(WebDriver driver) {
		driver.close();
	}

	@Override
	public void qutallpage(WebDriver driver) {
		driver.quit();
	}

	
	@Override
	public void asrrt(boolean condition) {
	Assert.assertFalse(condition);
	}

	@Override
	public void asrrteq(String actualco, String Expectco) {
	Assert.assertEquals(actualco, Expectco);
	}	
}