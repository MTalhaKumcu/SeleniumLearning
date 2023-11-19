package D3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C3_WebElementMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com");
        WebElement findBox = driver.findElement(By.id("twotabsearchtextbox"));
        //findBox.sendKeys("");
        System.out.println(findBox.isDisplayed());//true
        System.out.println(findBox.isEnabled());//true
        //System.out.println(findBox.isSelected());// if selected a checkbox or raido buttons
        System.out.println(findBox.getText());// get a text on find box

        findBox.sendKeys("Nutella");
        Thread.sleep(3000);
        findBox.clear();


        Thread.sleep(5000);
        driver.close();
    }
}
