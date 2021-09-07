package webbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebBrowser {
     static String url = "http://the-internet.herokuapp.com/"; //https://jahidulislam.us/";// http://54.172.98.170:443/ PMS APP
     public static void main(String[] args) {
       WebDriver driver = setUp();
        // logIn(driver);
        // checkBoxCheck(driver);
        // getBolg(driver);
        // dropDown(driver);
        // downloadFile(driver);
         tearDown(driver);

    }
    public static WebDriver setUp(){

          System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/webbrowser/chromedriver");
          ChromeOptions options = new ChromeOptions();
          options.addArguments("start-maximized");
//        DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
//        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
          WebDriver driver = new ChromeDriver(options);
          driver.get(url);
          System.out.println("Browser Opened");
          String currentUrl = driver.getCurrentUrl();
          System.out.println("Current URL: " + currentUrl);
          System.out.println("Page Title " + driver.getTitle());
          return driver;
     }

    public static void tearDown(WebDriver driver){
        driver.close();
    }
    public static void logIn(WebDriver driver){
         //driver.navigate().to("http://www.google.com");
         // Write username
        WebElement userName = driver.findElement(By.id("exampleInputEmail"));
        WebElement password = driver.findElement(By.id("exampleInputPassword"));
         userName.sendKeys("admin");
         password.sendKeys("123456");
         WebElement submitButton = driver.findElement(By.cssSelector("body > div > div > div > div > div > div > div > div > form > button"));
         submitButton.click();
    }
    public static void checkBoxCheck(WebDriver driver){
         WebElement checkBox = driver.findElement(By.linkText("Checkboxes"));
         checkBox.click();
         /**
          *   //*[@id="checkboxes"]/input[1]
          *
          * */
        List<WebElement> checkBoxElementList = driver.findElements(By.xpath("//*[@id=\"checkboxes\"]/input"));
        System.out.println(checkBoxElementList.size());
       /* WebElement checkBox01 = checkBoxElementList.get(0);
        boolean checkBox01Status = checkBox01.isSelected();
        if (checkBox01Status == false){
            checkBox01.click();
        }*/

        for (WebElement e : checkBoxElementList ) {
            if (e.isSelected()){
                System.out.println("Uncheck");
                e.click();
            }
            else{
                e.click();
                System.out.println("Checked");
            }
        }
    }
    public static void dropDown(WebDriver driver){
            WebElement dropdownLink = driver.findElement(By.linkText("Dropdown"));
            dropdownLink.click();
            WebElement dropDown = driver.findElement(By.id("dropdown"));
            Select dropDownSelect = new Select(dropDown);
            // dropDownSelect.selectByVisibleText("Option 1");
            List<WebElement>  options = dropDownSelect.getOptions();
            options.get(1).click();
    }
    public static void getBolg(WebDriver driver){
         WebElement blogText = driver.findElement(By.id("e431"));
        String contents =  blogText.getText();
        System.out.println(contents);
    }
    public static void downloadFile(WebDriver driver){
         WebElement fileDownloadPageLink = driver.findElement(By.linkText("File Download"));
         fileDownloadPageLink.click();
         System.out.println("Page Title " + driver.getTitle());
         WebElement fileElement = driver.findElement(By.linkText("sample.txt"));
         fileElement.click();

    }

}
