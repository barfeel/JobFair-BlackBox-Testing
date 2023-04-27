import org.openqa.selenium.By;

public class HomePage {
    final By usernameField = By.xpath("//input[@placeholder='Unesite korisnicko ime']");
    final By passwordField = By.xpath("//input[@placeholder='Unesite sifru']");
    final By potvrdiButton = By.xpath("//input[@name='potvrdi']");
    final By registracijaButton = By.xpath("//a[normalize-space()='REGISTRUJ SE:']");


    final By izlogujSeButton = By.xpath("//a[normalize-space()='IZLOGUJ SE']");
    final By otvoriJobFair = By.xpath("//a[normalize-space()='OTVORI JOB FAIR']//a[normalize-space()='OTVORI JOB FAIR']");
    final By nazivJobFair = By.xpath("//input[@name='naziv']");
    final By mesecOtvaranja = By.cssSelector("input[name='datumO']");
    final By danOtvaranja = By.cssSelector("input[name='datumO']");
    final By godinaOtvaranja = By.cssSelector("//input[@name='datumO']");



}
