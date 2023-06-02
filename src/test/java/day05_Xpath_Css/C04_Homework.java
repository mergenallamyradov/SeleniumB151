package day05_Xpath_Css;

        /*
        ÖDEV
        // 1. http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
        // 2. Add Element butonuna 100 defa basınız
        // 3. 100 defa basıldığını test ediniz
        // 4. 90 defa delete butonuna basınız
        // 5. 90 defa basıldığını doğrulayınız
        // 6. Sayfayı kapatınız
        */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Homework {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1step
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/ ");

        //2step
        int counter = 0;
        for (int i = 0; i < 100; i++) {
            WebElement addButton = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
            addButton.click();
            counter++;
        }
        System.out.println("Tiklama sayisi: " + counter);

        //3step
        if (counter==100){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //4step
        int counter2=0;
        for (int i=0; i<90; i++){
            WebElement deleteButton = driver.findElement(By.cssSelector("button[class='added-manually']"));
            deleteButton.click();
            counter2++;
        }
        System.out.println("Tiklama sayisi: " + counter2);

        //5step
        if (counter2==90){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //6step
       driver.close();



//        int addedElementsCount = driver.findElements(By.xpath("//button[contains(text(), 'Delete')]")).size();
//        if (addedElementsCount == 100) {
//            System.out.println("Add Element butonuna 100 defa basıldı.");
//        } else {
//            System.out.println("Add Element butonuna 100 defa basılmadi.");
//        }
//
//        for (int i = 0; i < 90 ; i++) {
//            WebElement deleteButton = driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
//            deleteButton.click();
//        }
//
//        int deletedElementsCount = driver.findElements(By.xpath("//button[contains(text(), 'Delete')]")).size();
//        if (deletedElementsCount == 10) {
//            System.out.println("Delete butonuna 90 defa basildi.");
//        } else {
//            System.out.println("Delete butonuna 90 defa basilmadi.");
//        }
//
//        driver.close();
    }
}
