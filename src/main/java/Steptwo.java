import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Steptwo extends Core{
    public void twopiyes() {
        click("//div[@data-name='ProfessionalIndemnityCover.NeedCover']//label[1]");
        click("//div[@data-name='ProfessionalIndemnityCover.CoverPastWork']//label[2]");
        next();
    }
    public void twopino() {
        click("//div[@data-name='ProfessionalIndemnityCover.NeedCover']//label[3]");
        next();
    }
    public void twoplyes(){
        click("//div[@data-name='PublicLiabilityCover.NeedCover']//label[1]");
        click("//div[@data-name='EmployersLiabilityCover.ELContract']//label[1]");
        click("//div[@data-name='EmployersLiabilityCover.NeedCover']//label[2]");
        next();
    }
    public void twoplno(){
        click("//div[@data-name='PublicLiabilityCover.NeedCover']//label[3]");
        click("//div[@data-name='EmployersLiabilityCover.ELContract']//label[2]");
        next();
    }
    }

