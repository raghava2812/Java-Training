package sjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GMeetJoin {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "F:\\1. Atos Syntel\\Java Training\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver gmdriver = new ChromeDriver();
        gmdriver.get("http://www.google.co.in");
        WebElement srch = gmdriver.findElement(By.name("q"));
        srch.click();
        srch.sendKeys("GMeet");
        srch.sendKeys(Keys.RETURN);
        gmdriver.manage().window().maximize();
        gmdriver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/div/div[1]/a/h3")).click();
        WebElement meetid = gmdriver.findElement(By.xpath("//*[@id='page-content']/section[1]/div/div[1]/div[2]/div/div[2]/input"));
        meetid.click();
        meetid.sendKeys("mwi-kqzw-rvt");
        gmdriver.findElement(By.xpath("//*[@id='page-content']/section[1]/div/div[1]/div[2]/div/div[2]/a/button/span")).click();
    }
}
