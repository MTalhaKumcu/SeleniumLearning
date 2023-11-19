package D4_Xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C3 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[text()='Add Element']")).click();

        WebElement deleteButtonElement = driver.findElement(By.xpath("//*[text()='Delete']"));

        if (deleteButtonElement.isDisplayed()) {
            System.out.println("delete is displayed , Test Passed");
        } else {
            System.out.println("delete is not displayed , Test Failed");
        }
        Thread.sleep(1000);

        deleteButtonElement.click();

        WebElement addRemoveText = driver.findElement(By.xpath("//h3"));

        if (addRemoveText.isDisplayed()) {
            System.out.println("The text is displayed , Test Passed");
        } else {
            System.out.println("Text is not displayed , Test Failed");
        }


        Thread.sleep(2000);
        driver.close();
    }
}