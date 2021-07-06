public class Merlin extends Core{
public void merlin(String policyno){
    sendKeys("//div[@id='QuickSearchDiv']//input[@id='quickSearchText']",policyno);
    click("//button[@ID='QuickSearchButtonImg']");
}
}

