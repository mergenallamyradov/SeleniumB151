package day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_ClassWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.crome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //Url'in https://amazon.com oldugunu test edelim
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";
        if(actualUrl.contains(expectedUrl)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED -> "+actualUrl);

        //Sayfayi kapatalim
        driver.close();  // Browser'i kapatir  // driver.quit(); Birden fazla browser varsa hepsini kapatir

    }
}
