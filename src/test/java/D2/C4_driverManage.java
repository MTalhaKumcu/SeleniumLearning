package D2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;
import java.time.Duration;

public class C4_driverManage {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("https://modablask.com");

        System.out.println("baslangic position " + driver.manage().window().getPosition());
        System.out.println("baslangic boyutu" + driver.manage().window().getSize());
        Thread.sleep(1000);

        driver.manage().window().maximize();
        System.out.println("baslangic position " + driver.manage().window().getPosition());
        System.out.println("baslangic boyutu" + driver.manage().window().getSize());
        Thread.sleep(1000);

        driver.manage().window().fullscreen();
        System.out.println("fullscreen position " + driver.manage().window().getPosition());
        System.out.println("fullscreen boyutu" + driver.manage().window().getSize());
        Thread.sleep(1000);

        driver.manage().window().minimize();
        System.out.println("min position"+driver.manage().window().getPosition());
        System.out.println("min konum"+ driver.manage().window().getSize());
        Thread.sleep(1000);

        driver.manage().window().setPosition(new Point(100,200));
        driver.manage().window().setSize(new Dimension(500,500));
        System.out.println("istenen konum"+driver.manage().window().getPosition());
        System.out.println("istenen boyut"+driver.manage().window().getSize());


        Thread.sleep(3000);
        driver.close();

    }
}
