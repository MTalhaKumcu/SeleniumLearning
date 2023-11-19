package D4_Xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        String expectedContent = "Spend less";
        String actuallTitle = driver.getTitle();
        if (actuallTitle.contains(expectedContent)) {
            System.out.println("Title TEST PASSED");
        } else {
            System.out.println("Title Test Failed");

        }
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@alt=\"Amazon Gift Cards\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class=\"nav-a-content\"])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class=\"_cDEzb_p13n-sc-css-line-clamp-3_g3dy1\"])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@id=\"gc-mini-picker-amount-1\"])[1]")).click();
        Thread.sleep(2000);
        WebElement priceElement = driver.findElement(By.xpath("//*[@id=\"gc-buy-box-text\"]/span"));

        String expectePrice = "$25.00";
        String actualPrice = priceElement.getText();
        if (expectePrice.equals(actualPrice)) {
            System.out.println("the price TEST PASSED");
        } else {
            System.out.println("the price TEST FAILED");
        }

        Thread.sleep(5000);
        driver.close();
    }
}
