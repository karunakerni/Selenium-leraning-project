package utilities;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Brokenlinks {
	public WebDriver driver;

	public Brokenlinks(WebDriver driver) {
		this.driver = driver;

	}

	public void links() throws MalformedURLException, IOException {

		List<WebElement> link = driver.findElements(By.tagName("a"));
		link.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Total links are::" + link.size());

		ArrayList<WebElement> activelink = new ArrayList<WebElement>();
		for (int i = 0; i < link.size(); i++) {
			String lname = link.get(i).getAttribute("href");
			if (lname != null) {
				{activelink.add(link.get(i));}
			}
			for (int j = 0; j < activelink.size(); j++) {
					String url = activelink.get(j).getAttribute("href");
						HttpURLConnection cont = (HttpURLConnection) new URL(url).openConnection();
						cont.connect();
						int numrep = cont.getResponseCode();
						String msg = cont.getResponseMessage();
						cont.disconnect();
						if (numrep > 200) {
							System.out.println("The url::" + url + "send message::" + msg + "with code::" + numrep);
						}
					} }}}
		


