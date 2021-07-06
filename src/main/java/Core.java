import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Core {
    public static WebDriver driver;
    public void setDriver(){
    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://lauda.quote.cloud.hiscox.com/business-insurance");
    driver.manage().window().maximize();
}
    public void setDriver1() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://lauda.merlin.cloud.hiscox.com/idit-web/policy_manager//policy.do");
        driver.manage().window().maximize();
        sendKeys("//div[@id='loginBox']//input[@id='UserName']","manoharh");
        sendKeys("//div[@id='loginBox']//input[@id='Password']","Hiscox2021");
        click("//div[@id='loginBox']//button[@id='Login']");
    }

    public  void wait(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }
    public  void move(String xpath) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath(xpath)));
    }
    public void jsclick(String xpath)
    {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", driver.findElement(By.xpath(xpath)));
    }
    public  void questionsYesOrNo(String xpath,boolean value) {
        wait(xpath);
        driver.findElement(By.xpath(xpath+ (value ?"//label[1]":"//label[2]"))).click();
    }

    public  void click(String xpath) {
        wait(xpath);
        driver.findElement(By.xpath(xpath)).click();
    }
    public String get(String xpath) {
        wait(xpath);
        return driver.findElement(By.xpath(xpath)).getText();
    }
    public  void sendKeys(String xpath,String value) {
        wait(xpath);
        driver.findElement(By.xpath(xpath)).clear();
        driver.findElement(By.xpath(xpath)).sendKeys(value);
    }
    public void next(){
        click("//div[@data-name='NavigationDetails']//button[text()='Next']");
    }
    }
