/*package D2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C3_ilktest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver drvr = new ChromeDriver();
        drvr.get("https://www.instagram.com");
        System.out.println("Sayfa basligi => " + drvr.getTitle());

        String expectedContent = "instagram";
        String actualTitle = drvr.getTitle();

        if (actualTitle.contains(actualTitle)) {
            System.out.println("Title contain Instagram ,TEST PASSED");
        } else {
            System.out.println("Tittle does not contain Instagram ,TEST FAILED");
        }

        System.out.println("page url => " + drvr.getCurrentUrl());
        expectedContent = "Instagram";
        String actualURL = drvr.getCurrentUrl();

        if (actualURL.contains(expectedContent)) {
            System.out.println("url contains Instagram, Test Passed");
        } else {
            System.out.println("url does not contains Instagra, Test Failed");
        }

        System.out.println("page Handle value => " + drvr.getWindowHandle());

        expectedContent = "login";
        String actualPageSource = drvr.getPageSource();

        if (actualPageSource.contains(expectedContent)) {
            System.out.println("there is login ,Test Passed");
        } else {
            System.out.println("There is no login, Test Failed");
        }


        Thread.sleep(3000);
        drvr.close();

    }
}
*/