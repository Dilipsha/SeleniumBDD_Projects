package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    public static String hamburger_menu_xpath="//input[@type='checkbox']";
    public static String signIn_link_xpath="(//li[normalize-space()='Sign In Portal'])[1]";
    public static WebDriver driver;

    public static void click_hamburger_menu() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        driver=new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        Thread.sleep(2000);

        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
        //driver.findElement(By.xpath(signIn_link_xpath)).click();
    }

    public static void click_signIn_link() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(signIn_link_xpath)).click();
    }
}
