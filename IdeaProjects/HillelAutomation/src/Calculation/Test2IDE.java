package testAutomation;

import java.util.List;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import java.io.File;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.*;


import static com.sun.xml.internal.ws.client.ContentNegotiation.none;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2IDE {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    /*File pathBinary = new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
    FirefoxBinary Binary= new FirefoxBinary(pathBinary);
    FirefoxProfile firefoxPro = new FirefoxProfile();
    driver = new FirefoxDriver(Binary, firefoxPro);*/
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com.ua/";
    driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
  }

  @Test
  public void test2IDE() throws Exception {
    driver.get(baseUrl + "/?gfe_rd=cr&ei=GHxZV7r2FOKcwwO_yaOgDg&gws_rd=ssl");
    driver.findElement(By.id("lst-ib")).clear();
    driver.findElement(By.id("lst-ib")).sendKeys("gmail.com");
    driver.findElement(By.cssSelector(".r> a")).click();
    driver.findElement(By.id("Email")).sendKeys("agramatik1@gmail.com");
    driver.findElement(By.id("next")).click();
    driver.findElement(By.id("PersistentCookie")).click();
    driver.findElement(By.id("Passwd")).sendKeys("vtec1986");
    driver.findElement(By.id("signIn")).click();
    driver.findElement(By.id(":2t")).click();
    driver.findElement(By.xpath("//div[@id=':30']//*/div[@role='menuitem'or'menuitemcheckbox'][@style='-moz-user-select: none;'][8]")).click();

    /*List<WebElement>listOfElementsSettings;
    listOfElementsSettings=driver.findElements(By.xpath("//div[@id=':30']*//*//*div[@role='menuitem'or'menuitemcheckbox'][@style='-moz-user-select: none;'])"));
    Boolean visible =*/
    driver.findElement(By.cssSelector("a.wrap_label > div.text_label")).click();
    driver.findElement(By.linkText("QA")).click();
    driver.findElement(By.linkText("QA Automation")).click();
  }


  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
