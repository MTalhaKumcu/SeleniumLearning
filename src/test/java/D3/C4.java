package D3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.automationexercise.com/");
        List<WebElement> linkeElements = driver.findElements(By.tagName("a"));
        int expectedLink = 147;
        int actualLink = linkeElements.size();

        if (expectedLink == actualLink) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        WebElement productsLinkElement = driver.findElement(By.partialLinkText("Products"));
        productsLinkElement.click();
        WebElement specialOfferElement = driver.findElement(By.id("sale_image"));
       if(specialOfferElement.isDisplayed()) {
           System.out.println("Special Test Passed");
       }else {
           System.out.println("special Test Failed");
       }

        Thread.sleep(5000);
        driver.close();
    }
}
