package sjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public final class ChromeApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","F:\\1. Atos Syntel\\Java Training\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver dvc = new ChromeDriver();
        String url = "https://www.google.com";
        dvc.navigate().to(url);
        // dvc.get(url);
        dvc.manage().window().maximize();
        Thread.sleep(1000);
        // String title = dvc.getTitle();
        // System.out.println(title);
        WebElement r = dvc.findElement(By.name("q"));
        r.sendKeys("technewsmr.blogspot");
        Thread.sleep(2000);
        r.sendKeys(Keys.RETURN);
        dvc.findElement(By.cssSelector("h3.LC20lb.MBeuO.DKV0Md")).click();
        Thread.sleep(1000);
        // dvc.findElement(By.cssSelector("a.page-num")).click();
        // WebElement pgs = dvc.findElement(By.className("page-num"));
        // List <WebElement> lst = pgs.findElements(By.className("page-num"));
        // System.out.println(lst);
        WebElement blg = dvc.findElement(By.xpath("//*[@id='Blog1']/div[1]/div/div[4]/div[2]/a"));
        Thread.sleep(500);
        blg.click();
        Thread.sleep(3000);
        // dvc.navigate().to("https://www.youtube.com/");
        // WebElement youtube_search = dvc.findElement(By.name("search_query"));
        // Thread.sleep(5000);
        // youtube_search.sendKeys("Tech Arena");
        // Thread.sleep(1000);
        // youtube_search.sendKeys(Keys.RETURN);
        // dvc.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[1]/div[2]/ytd-search-sub-menu-renderer/div[1]/div/ytd-toggle-button-renderer/a/tp-yt-paper-button")).click();
        // Thread.sleep(1000);
        // dvc.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[1]/div[2]/ytd-search-sub-menu-renderer/div[1]/iron-collapse/div/ytd-search-filter-group-renderer[2]/ytd-search-filter-renderer[2]/a/div")).click();
        // Thread.sleep(1000);
        // dvc.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-channel-renderer[2]/div/div[1]/a/div/yt-img-shadow/img")).click();

        WebElement ytb = dvc.findElement(By.xpath("//*[@id='HTML2']/div[2]/a/img"));
        Thread.sleep(7000);
        ytb.click();
        Thread.sleep(7000);
        WebElement ytvid = dvc.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-browse/ytd-two-column-browse-results-renderer/div[1]/ytd-section-list-renderer/div[2]/ytd-item-section-renderer[2]/div[3]/ytd-shelf-renderer/div[1]/div[2]/yt-horizontal-list-renderer/div[2]/div/ytd-grid-video-renderer[2]/div[1]/div[1]/div[1]/h3/a"));
        // Thread.sleep(10000);
        ytvid.click();
        Thread.sleep(60000);
        dvc.quit();
    }
}
