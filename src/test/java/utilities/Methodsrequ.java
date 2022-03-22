package utilities;

import java.util.concurrent.locks.Condition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface Methodsrequ {

	public void impwait(WebDriver driver,int num);
	public void pageld(WebDriver driver,int num);
	
	public void textcap(WebElement ele);

	public void softasrt(boolean cond);

	public void newin(WebDriver driver);

	public boolean Elemtvisi(WebDriver driver, int time, WebElement element);

	public boolean Elemtclkble(WebDriver driver, int time, WebElement element);

	public boolean alrtprest(WebDriver driver, int time);

	public void frameswit(WebDriver driver, WebElement element, int time);

	public void axismove(WebDriver driver, int A, int B);

	public void scrollview(WebDriver driver, WebElement element);

	public void moveatend(WebDriver driver, WebElement element);

	public void senddata(WebDriver driver, String s);

	public void actclkdata(WebDriver driver);

	public void drgdrp(WebElement Sourceele, WebElement targetele);

	public void mousehover(WebDriver driver, WebElement element);

	public String tittle(WebDriver driver);


	public void chkboxbyvalwithnotext(WebElement element,String inp);

	public void slctbyindx(WebElement element, int optval);

	public void mulwind(WebDriver driver);

	public void closcurrpage(WebDriver driver);

	public void qutallpage(WebDriver driver);

	public void asrrt(boolean condition);

	public void asrrteq(String actualco, String Expectco);


}
