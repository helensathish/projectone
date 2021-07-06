public class SummaryPage extends Core{
    public void summary()
    {
        questionsYesOrNo("//div[@data-name='Policy.Agree']", true);
        click("//button[@class='btn bbf-button bbf-button-continue DefaultButton ShowWaitMessage']");
    }
}
