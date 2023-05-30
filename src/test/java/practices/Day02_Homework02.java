package practices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day02_Homework02 {
    /*
    Yeni bir class olusturun (TekrarTesti)
Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
Daha sonra Amazon sayfasina gidin https://www.amazon.com/
Youtube sayfasina geri donun
Sayfayi yenileyin
Amazon sayfasina donun
Sayfayi tamsayfa yapin
Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru başlığı(Actual Title) yazdırın.
Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
URL'yi yazdırın
Sayfayi kapatin
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

       driver.get("https://youtube.com/");

       String actualName = driver.getCurrentUrl();
       String arananKelime = "youtube";
       if (actualName.contains(arananKelime)){
           System.out.println("Test PASSED");
       }else System.out.println("Test FAILED ->>" + actualName);

       driver.get("https://www.amazon.com/");
       driver.navigate().back();
       driver.navigate().refresh();
       driver.navigate().forward();
       driver.manage().window().fullscreen();

        String actualtitle = driver.getTitle();
        String aranantitle = "Amazon";
        if (actualtitle.contains(aranantitle)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED ->>" + actualtitle);

        String actualUrl = driver.getCurrentUrl();
        String arananUrl = "https://www.amazon.com/";
        if (actualUrl.contains(arananUrl)){
            System.out.println("Test PASSED");
        }

        driver.close();

    }


}
