import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class Administrator extends HomePage {


        @Test
        public void administratorLogIn() {
            System.setProperty("webdrover.chrome.driver", "\"D:\\chromedriver\\chromedriver.exe\"");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://localhost/projekat3/projekat3/projekatIP/index.php");
            driver.findElement(usernameField).sendKeys("tviti");
            driver.findElement(passwordField).sendKeys("Admin123.");
            driver.findElement(potvrdiButton).click();
            driver.getTitle();
            driver.quit();
        }

        @Test
        public void pogledajPrijaveNaJobFair() {
            System.setProperty("webdrover.chrome.driver", "\"D:\\chromedriver\\chromedriver.exe\"");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://localhost/projekat3/projekat3/projekatIP/index.php");
            driver.findElement(usernameField).sendKeys("tviti");
            driver.findElement(passwordField).sendKeys("Admin123.");
            driver.findElement(potvrdiButton).click();
            driver.findElement(By.xpath("//a[normalize-space()='POGLEDAJ PRIJAVE NA JOB FAIR']")).click();
            driver.findElement(By.cssSelector("body > table:nth-child(7) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1)")).getText();
            driver.findElement(By.cssSelector("body > table:nth-child(7) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(3)")).getText();
            driver.quit();
        }


        @Test
        public void promenaLozinkeAdmin(){
            System.setProperty("webdrover.chrome.driver", "\"D:\\chromedriver\\chromedriver.exe\"");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://localhost/projekat3/projekat3/projekatIP/index.php");
            driver.findElement(By.xpath("//a[normalize-space()='PROMENI LOZINKU:']")).click();
            driver.findElement(By.xpath("//input[@placeholder='Unesite korisnicko ime']")).sendKeys("stevica");
            driver.findElement(By.xpath("//input[@placeholder='Unesite staru sifru']")).sendKeys("Admin.123");
            driver.findElement(By.xpath("//input[@placeholder='Unesite novu sifru']")).sendKeys("Admin123.");
            driver.findElement(By.xpath("//input[@name='potvrdi']")).click();
            driver.quit();


        }









}
