import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kompanija extends HomePage{
  @Test
  public void kompanijaLogin(){
      System.setProperty("webdrover.chrome.driver", "\"D:\\chromedriver\\chromedriver.exe\"");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("http://localhost/projekat3/projekat3/projekatIP/index.php");
      driver.findElement(usernameField).sendKeys("Endava");
      driver.findElement(passwordField).sendKeys("Endava.123");
      driver.findElement(potvrdiButton).click();
      driver.getTitle();
      driver.quit();
  }
  @Test
  public void promenaLozinkeKompanija(){
      System.setProperty("webdrover.chrome.driver", "\"D:\\chromedriver\\chromedriver.exe\"");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("http://localhost/projekat3/projekat3/projekatIP/index.php");
      driver.findElement(By.xpath("//a[normalize-space()='PROMENI LOZINKU:']")).click();
      driver.findElement(By.xpath("//input[@placeholder='Unesite korisnicko ime']")).sendKeys("Endava doo");
      driver.findElement(By.xpath("//input[@placeholder='Unesite staru sifru']")).sendKeys("Endava.123");
      driver.findElement(By.xpath("//input[@placeholder='Unesite novu sifru']")).sendKeys("Kompanija.123");
      driver.findElement(By.xpath("//input[@name='potvrdi']")).click();
      driver.quit();

  }
  @Test
    public void otvaranjeKonkursa(){
      System.setProperty("webdrover.chrome.driver", "\"D:\\chromedriver\\chromedriver.exe\"");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("http://localhost/projekat3/projekat3/projekatIP/index.php");
      driver.findElement(usernameField).sendKeys("Endava");
      driver.findElement(passwordField).sendKeys("Endava.123");
      driver.findElement(potvrdiButton).click();
      driver.findElement(By.xpath("//a[normalize-space()='OTVORI KONKURS']")).click();
      driver.findElement(By.xpath("//input[@name='naziv']")).sendKeys("Nocni cuvar");
      driver.findElement(By.xpath("//input[@id='posao']")).click();
      driver.findElement(By.xpath("//input[@name='datum']")).sendKeys("05");
      driver.findElement(By.xpath("//input[@name='datum']")).sendKeys("01");
      driver.findElement(By.xpath("//input[@name='datum']")).sendKeys("2023");
      driver.findElement(By.xpath("//input[@name='vreme']")).sendKeys("10");
      driver.findElement(By.xpath("//input[@name='vreme']")).sendKeys("10");
      driver.findElement(By.xpath("//input[@name='vreme']")).sendKeys("AM");
      driver.findElement(By.xpath("//input[@name='potvrdi']")).click();
      driver.findElement(By.cssSelector("#regstudent1")).getText();
      driver.findElement(By.xpath("//a[normalize-space()='OVDE']")).click();
      driver.quit();

  }




}
