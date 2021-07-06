import jdk.nashorn.internal.parser.JSONParser;
import org.openqa.selenium.By;

public class PayPage extends Core{
    public String pay() throws InterruptedException{
        click("//input[@data-fieldname='Payment.AccountNumber']");
        sendKeys("//input[@data-fieldname='Payment.AccountNumber']", "12345677");
        sendKeys("//div[@class='bbf-answer form-inline row sortcode-fields-wrapper autotabbed']//input[1]", "00");
        sendKeys("//div[@class='bbf-answer form-inline row sortcode-fields-wrapper autotabbed']//input[2]", "00");
        sendKeys("//div[@class='bbf-answer form-inline row sortcode-fields-wrapper autotabbed']//input[3]", "04");
        click("//div[@data-name='AccountNumber']//button[text()='Find my bank details']");
        click("//div[@data-name='Payment.AgreeDirectDebit']//label[1]");
        click("//div[@data-name='NavigationPaymentDetails']//button[text()='Pay']");
        String pol = get("//div[@data-name='PolicyNumber']").replace("Your policy number\n", "");
        System.out.println("Policy Number is"+pol);
        return pol;
        }
}
