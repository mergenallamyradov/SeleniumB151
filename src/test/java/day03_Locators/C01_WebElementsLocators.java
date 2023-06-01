package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebElementsLocators {
    public static void main(String[] args) throws InterruptedException {
      /*
        Bir webelementin locate'ini birden fazla kullanacaksaniz bir Webelement'te değişken olarak atayabilirsiniz.
        Webelement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox")); şeklinde kullanabiliriz
        1-Locate işlemi bittikten sonra eğer webelemente bir metin göndereceksek sendKeys() methodu kullanırız
        2-webelemente tıklayacaksak click() methodu kullanırız
        3-webelementin üzerindeki yazıyı almak istiyorsak getText() methodunu kullanırız
        4-sendKeys() methodundan sonra(yani webElemente metin gönderdikten sonra) Keys.ENTER ile yada
        submit() methodu ile manuel olarak enter yaptığımız gibi otomasyonda da yapabiliriz.
         */

            System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            // https://www.amazon.com sayfasına gidiniz
            driver.get("https://www.amazon.com");


            // aramakutusunu locate ediniz ve Nutella aratınız
            WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
            aramaKutusu.sendKeys("Nutella" + Keys.ENTER);


        /*
        Eger bir webelement'i birden fazla kullanmayacaksanız bir webelement'e esayn etmeyebilirsiniz.
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella" + Keys.ENTER);
         */

            Thread.sleep(2000);



            // sayfayı kapatınız
            driver.close();
    }
}
