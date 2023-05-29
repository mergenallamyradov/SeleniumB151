package practices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigateMethods_Practice {
    public static void main(String[] args) throws InterruptedException {
       /*
        Yeni bir Class olusturalim.C05_NavigationMethods
        1. Youtube ana sayfasina gidelim . https://www.youtube.com/
        2. Amazon soyfasina gidelim. https://www.amazon.com/
        3. Tekrar YouTube’sayfasina donelim
        4. Yeniden Amazon sayfasina gidelim
        5. Sayfayi Refresh(yenile) yapalim
        6. Sayfayi kapatalim / Tum sayfalari kapatalim

        */

        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //1
        driver.get("https://www.youtube.com/");
        Thread.sleep(3000);

        //2
        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);

        //3
        driver.navigate().back();
        Thread.sleep(3000);

        //4
        driver.navigate().forward();
        Thread.sleep(3000);

        //5
        driver.navigate().refresh();

        //6
        driver.close();

    }
}
