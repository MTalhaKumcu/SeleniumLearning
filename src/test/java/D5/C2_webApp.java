package D5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C2_webApp {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://zero.webappsecurity.com");
        driver.findElement(By.id("signin_button")).click();
        WebElement loginBox = driver.findElement(By.id("user_login"));
        loginBox.sendKeys("username");
        WebElement passwordBox = driver.findElement(By.id("user_password"));
        passwordBox.sendKeys("password");
        driver.findElement(By.name("submit")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
        driver.findElement(By.id("pay_bills_link")).click();
        WebElement amountFill = driver.findElement(By.id("sp_amount"));
        amountFill.sendKeys("200");
        WebElement dateBox = driver.findElement(By.id("sp_date"));
        dateBox.sendKeys("2020-09-10");
        driver.findElement(By.id("pay_saved_payees")).click();
        WebElement submitText = driver.findElement(By.id("alert_content"));

        if (submitText.isDisplayed()) {
            System.out.println("text is TEST PASSED");
        } else {
            System.out.println("text is TEST FAILED");
        }

        Thread.sleep(2000);
        driver.close();

    }
}
