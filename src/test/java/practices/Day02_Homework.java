package practices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day02_Homework {
    /*
      Yeni bir class olusturalim (Homework)
      ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
      oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
      Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
      https://www.walmart.com/ sayfasina gidin.
      Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
      Tekrar “facebook” sayfasina donun
      Sayfayi yenileyin
      Sayfayi tam sayfa (maximize) yapin  9.Browser’i kapatin
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.crome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.facebook.com/");

        String actualTitle = driver.getTitle();
        String arananKelime = "Facebook";
        if (actualTitle.contains(arananKelime)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED -> " + actualTitle);

        driver.get("https://www.walmart.com/");
        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.close();
    }


}
