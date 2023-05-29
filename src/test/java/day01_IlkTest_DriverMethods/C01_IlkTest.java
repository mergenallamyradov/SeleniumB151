package day01_IlkTest_DriverMethods;

import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chromeDriver", "src/resources/drivers/chromedriver.exe");

        System.out.println(System.getProperty("webdriver.chromeDriver"));

        WebDriver driver = new ChromeDriver();
        driver.get("https:/techproeducation.com");
    }

}

