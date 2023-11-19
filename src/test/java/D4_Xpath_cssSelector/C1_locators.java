package D4_Xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C1_locators {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com");
        WebElement findBox = driver.findElement(By.id("twotabsearchtextbox"));
        findBox.sendKeys("city bike" + Keys.ENTER);

        WebElement searchItemElement = driver.findElement(By.className("sg-col-inner"));
        System.out.println(searchItemElement.getText());

        List <WebElement> ItemPictureElement = driver.findElements(By.className("s-image"));
        ItemPictureElement.get(0).click();



        Thread.sleep(3500);
        driver.close();

    }
}
