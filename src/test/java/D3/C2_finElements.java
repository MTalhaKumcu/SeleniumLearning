package D3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C2_finElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.automationexercise.com");
        List <WebElement> categoryElementsList = driver.findElements(By.className("panel-title"));


        int expectedsize = 3;
        int actiualsize = categoryElementsList.size();

        if (expectedsize == actiualsize){
            System.out.println("Test Passed ");
        }
        else {
            System.out.println("Test Failed");
        }

        for (WebElement eachElements: categoryElementsList
             ) {
            System.out.println(eachElements.getText());
        }
        System.out.println(categoryElementsList);

        Thread.sleep(5000);
        driver.close();

    }
}
