import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Student extends HomePage{
   @Test
   public void studentLogin(){
       System.setProperty("webdrover.chrome.driver", "\"D:\\chromedriver\\chromedriver.exe\"");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://localhost/projekat3/projekat3/projekatIP/index.php");
       driver.findElement(usernameField).sendKeys("barfeel");
       driver.findElement(passwordField).sendKeys("Filip.1993");
       driver.findElement(potvrdiButton).click();
       driver.getTitle();

       driver.quit();
   }

   @Test
    public void registracijaStudenta(){
       System.setProperty("webdrover.chrome.driver", "\"D:\\chromedriver\\chromedriver.exe\"");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://localhost/projekat3/projekat3/projekatIP/index.php");
       driver.findElement(registracijaButton).click();
       driver.findElement(By.xpath("//input[@name='Potvrdi']")).click();
       driver.findElement(By.xpath("//input[@name='kime']")).sendKeys("Student");
       driver.findElement(By.xpath("//input[@name='sifra']")).sendKeys("Student.123");
       driver.findElement(By.xpath("//input[@name='ime']")).sendKeys("Pera");
       driver.findElement(By.xpath("//input[@name='prezime']")).sendKeys("Peric");
       driver.findElement(By.xpath("//input[@name='telefon']")).sendKeys("+381641233444");
       driver.findElement(By.xpath("//input[@name='mejl']")).sendKeys("pera@google.rs");
       driver.findElement(By.xpath("//input[@name='godstudija']")).sendKeys("4");
       driver.findElement(By.xpath("//input[@value='da']")).click();
       driver.findElement(By.xpath("//input[@name='Registruj']")).click();
       driver.quit();

   }
   @Test
   public void promenaLozinkeStudent(){
      System.setProperty("webdrover.chrome.driver", "\"D:\\chromedriver\\chromedriver.exe\"");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("http://localhost/projekat3/projekat3/projekatIP/index.php");
      driver.findElement(By.xpath("//a[normalize-space()='PROMENI LOZINKU:']")).click();
      driver.findElement(By.xpath("//input[@placeholder='Unesite korisnicko ime']")).sendKeys("baracfilip1993");
      driver.findElement(By.xpath("//input[@placeholder='Unesite staru sifru']")).sendKeys("Filip.1993");
      driver.findElement(By.xpath("//input[@placeholder='Unesite novu sifru']")).sendKeys("Student.123");
      driver.findElement(By.xpath("//input[@name='potvrdi']")).click();
      driver.quit();

   }


   @Test
    public void uneosBiografijeStudenta(){
       System.setProperty("webdrover.chrome.driver", "\"D:\\chromedriver\\chromedriver.exe\"");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://localhost/projekat3/projekat3/projekatIP/index.php");
       driver.findElement(usernameField).sendKeys("barfeel");
       driver.findElement(passwordField).sendKeys("Filip.1993");
       driver.findElement(potvrdiButton).click();
       driver.getTitle();
       driver.findElement(By.xpath("//a[normalize-space()='UNESI BIOGRAFIJU']")).click();
       driver.findElement(By.xpath("//input[@name='ime']")).sendKeys("Pera");
       driver.findElement(By.xpath("//input[@name='prezime']")).sendKeys("Peric");
       driver.findElement(By.xpath("//input[@name='adresa']")).sendKeys("Svetogorska 1");
       driver.findElement(By.xpath("//input[@name='grad']")).sendKeys("Kragujevac");
       driver.findElement(By.xpath("//input[@name='drzava']")).sendKeys("Srbija");
       driver.findElement(By.xpath("//input[@name='telefon']")).sendKeys("0800300200");
       driver.findElement(By.xpath("//input[@name='mejl']")).sendKeys("pera@beotel.net");
       driver.findElement(By.xpath("//input[@name='mjezik']")).sendKeys("srpski");
       driver.findElement(By.xpath("//input[@name='potvrdi']")).click();
       driver.quit();

   }

   @Test
    public void pretraziKonkurse(){
       System.setProperty("webdrover.chrome.driver", "\"D:\\chromedriver\\chromedriver.exe\"");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://localhost/projekat3/projekat3/projekatIP/index.php");
       driver.findElement(usernameField).sendKeys("barfeel");
       driver.findElement(passwordField).sendKeys("Filip.1993");
       driver.findElement(potvrdiButton).click();
       driver.findElement(By.xpath("//a[normalize-space()='PRETRAZI KONKURSE']")).click();
       driver.findElement(By.xpath("//form[@name='formaPretraziKonkurse']//input[@name='naziv']")).sendKeys("qa tester");
       driver.findElement(By.xpath("//input[@name='posao']")).click();
       driver.findElement(By.xpath("//input[@name='potvrdi']")).click();
       driver.findElement(By.cssSelector("body > table:nth-child(7) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1)")).getText();
       driver.quit();

   }











}
