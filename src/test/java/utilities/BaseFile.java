package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseFile {
	public WebDriver driver;

	public Properties prop;
	public String path = System.getProperty("user.dir") + "\\src\\test\\java\\utilities\\file.Properties";

	public WebDriver Driverinitation() throws IOException {

		prop = new Properties();
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		System.out.println("The path is ::" + path);
		String url = prop.getProperty("url");
		System.out.println("The required URL is::" + url);

		String browser = prop.getProperty("browser1");
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("Safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		} else if (browser.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		return driver;
	}

	public String screenshot(WebDriver driver, String Name) throws IOException {
		Timem tm = new Timem();
		String tim = tm.time();
		String path = System.getProperty("user.dir") + "\\screenshot\\file.html" + tim;
		System.out.println(path);
		TakesScreenshot shot = ((TakesScreenshot) driver);
		File src = shot.getScreenshotAs(OutputType.FILE);
		File dst = new File(path);
		FileUtils.copyFile(src, dst);
		return path;

	}

}
