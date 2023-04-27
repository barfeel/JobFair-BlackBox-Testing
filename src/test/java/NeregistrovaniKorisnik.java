import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
;

public class NeregistrovaniKorisnik extends HomePage {
    @Test
    public void pretragaKompanijaPoNazivu() {
            System.setProperty("webdrover.chrome.driver", "\"D:\\chromedriver\\chromedriver.exe\"");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://localhost/projekat3/projekat3/projekatIP/index.php");
            driver.findElement(By.xpath("//a[normalize-space()='PRETRAZI KOMPANIJE']")).click();
            driver.findElement(By.xpath("//input[@name='ime']")).sendKeys("Endava");
            driver.findElement(By.xpath("//div[@id='txtIspis']")).getText();
            driver.quit();
    }
    @Test
    public void pretragaKompanijaPoDelatnosti(){
        System.setProperty("webdrover.chrome.driver", "\"D:\\chromedriver\\chromedriver.exe\"");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/projekat3/projekat3/projekatIP/index.php");
        driver.findElement(By.xpath("//a[normalize-space()='PRETRAZI KOMPANIJE']")).click();
        driver.findElement(By.xpath("//input[@id='IT']")).click();
        driver.findElement(By.cssSelector("#txtIspis")).getText();
        driver.quit();

    }

}
