package D5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C3_googleNutella {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://www.google.com/");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
        Thread.sleep(2000);

        String expectedContent = "Google";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedContent)){
            System.out.println("Title TEST PASSED");
        }
        else {
            System.out.println("Title TEST FAILED");
        }
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        searchButton.sendKeys("Nutella"+ Keys.ENTER);

        WebElement aroundText =driver.findElement(By.id("result-stats"));
        System.out.println(aroundText.getText());

        String resultStr = aroundText.getText();
        String[] wordArr = resultStr.split(" ");
        String wordCounter = wordArr[1];
        wordCounter = wordCounter.replaceAll("\\D", "");
        int resultText = Integer.parseInt(wordCounter);

        if (resultText>100000000){
            System.out.println("Result text , TEST PASSED");
        }
        else {
            System.out.println("Result text , TEST FAILED");
        }


        Thread.sleep(3000);
        driver.close();
    }
}
