package sjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public final class CreateGmailAccount {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\1. Atos Syntel\\Java Training\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver drivers = new ChromeDriver();
        Thread.sleep(1000);
        drivers.manage().window().maximize();
        Thread.sleep(1000);
        drivers.get("https://www.google.co.in");
        WebElement wbe = drivers.findElement(By.name("q"));
        wbe.sendKeys("Gmail");
        wbe.sendKeys(Keys.RETURN);
        Thread.sleep(1500);
        drivers.findElement(By.xpath("//*[@id='rso']/div[1]/div/div[1]/div/div/div[1]/div/a/h3")).click();
        Thread.sleep(1000);
        // /html/body/header/div/div/div/a[2]
        drivers.findElement(By.xpath("/html/body/header/div/div/div/a[3]")).click();
        Thread.sleep(500);
        drivers.findElement(By.name("firstName")).sendKeys("Mail");
        Thread.sleep(500);
        drivers.findElement(By.name("lastName")).sendKeys("Selenium");
        Thread.sleep(500);
        drivers.findElement(By.name("Username")).sendKeys("mailselenium00123");
        Thread.sleep(500);
        drivers.findElement(By.name("Passwd")).sendKeys("abcd@1234");
        Thread.sleep(500);
        drivers.findElement(By.name("ConfirmPasswd")).sendKeys("abcd@1234");
        Thread.sleep(500);
        drivers.findElement(By.xpath("//*[@id='accountDetailsNext']/div/button")).click();
    }
}
