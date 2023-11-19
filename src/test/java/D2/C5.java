package D2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // test icin olmazsa olmazlardir
        /*
        1- driver icin gerekli ayalamalari yap
        2- webDriver olustur
        3-window`u max yap
        4-gecikmeler icin max bekleme suresi tanimla

        */
    }
}
