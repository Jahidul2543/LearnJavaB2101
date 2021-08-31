package webbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/jahidul/IdeaProjects/LearnJavaB2101/src/main/java/webbrowser/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

//        DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
//        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, options);

        WebDriver driver = new ChromeDriver(options);

        driver.get("http://54.172.98.170:443/");

        System.out.println("Browser Opened");
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
        System.out.println("Page Title " + driver.getTitle());
        //driver.navigate().to("http://www.google.com");
        // Write username
        driver.findElement(By.id("exampleInputEmail")).sendKeys("admin");
        driver.findElement(By.id("exampleInputPassword")).sendKeys("123456");
        driver.findElement(By.cssSelector("body > div > div > div > div > div > div > div > div > form > button")).click();

        driver.close();

    }
}
