package sjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public final class EdgeApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","F:\\1. Atos Syntel\\Java Training\\Selenium\\edgedriver_win64\\msedgedriver.exe");
        WebDriver dve = new EdgeDriver();
        String url = "https://www.google.co.in";
        // dv.navigate().to(url);
        dve.get(url);
        dve.manage().window().maximize();
        String title = dve.getTitle();
        System.out.println(title);
        WebElement r = dve.findElement(By.name("q"));
        r.sendKeys("technewsmr");
        r.sendKeys(Keys.RETURN);
        dve.quit();
    }
}
