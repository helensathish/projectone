public class StepOne extends Core{
    public void one(String primarytrade) throws InterruptedException
    {
        click("//label[@class='btn btn-primary icon IconLimitedCompany ']");
        sendKeys("//input[@data-fieldname='Company.BusinessName']","Sheroes");
        sendKeys("//input[@placeholder='MM']","12");
        sendKeys("//input[@placeholder='YYYY']","2000");
        sendKeys("//input[@data-fieldname='Company.Turnover']","260000");
        sendKeys("//input[@data-fieldname='Company.PrimaryTradeNameShown']",primarytrade);
        click("//div[@data-name='Company.PrimaryTradeNameShown']//li[1]");
        click("//input[@value='UK']//parent::label");
        Thread.sleep(500);
        click("//div[@data-name='Company.IDDContentsQuestion']//label[2]");
        click("//div[@data-name='IDDCyberQuestion']//label[2]");
        click("//div[@data-name='Person.Title']");
        click("//div[@data-name='Person.Title']//li//span[(text()='Mr')]");
        sendKeys("//input[@placeholder='Type your first name']","Test");
        sendKeys("//input[@placeholder='Type your last name']","Sqs");
        sendKeys("//input[@data-fieldname='Person.Landline']","98798798799");
        sendKeys("//input[@data-fieldname='Person.Email']","helen.manohar@hiscox.com");
        sendKeys("//input[@data-fieldname='Address.HouseNameNumber']","5");
        sendKeys("//input[@data-fieldname='Address.Postcode']","cv35qq");
        click("//div[@data-name='FindAddress']//button[text()='Find address']");
        sendKeys("//div[@data-name='CoverStart']//input[@placeholder='YYYY']", "2021");
        sendKeys("//div[@data-name='CoverStart']//input[@placeholder='MM']", "05");
        sendKeys("//div[@data-name='CoverStart']//input[@placeholder='DD']", "31");
        click("//div[@data-name='CoverStart']");
        move("//button[@class='btn bbf-button bbf-button-choosecover DefaultButton ']");
        Thread.sleep(500);
        jsclick("//button[@class='btn bbf-button bbf-button-choosecover DefaultButton ']");
    }
}

