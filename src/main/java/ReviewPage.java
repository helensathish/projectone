public class ReviewPage extends Core {
    public void review() {
        questionsYesOrNo("//div[@data-name='Declaration.Bankrupt']", false);
        questionsYesOrNo("//div[@data-name='Declaration.Convicted']", false);
        questionsYesOrNo("//div[@data-name='Declaration.InsuranceCancelled']", false);
        questionsYesOrNo("//div[@data-name='Declaration.LiabilityCircumstance']", false);
        questionsYesOrNo("//div[@data-name='Declaration.ClaimOccured']", false);
    }
    public void reviewpi() {
        questionsYesOrNo("//div[@data-name='ProfessionalIndemnitySoF.TechnologyQuestion3']", false);
        questionsYesOrNo("//div[@data-name='ProfessionalIndemnitySoF.FintechRegulatedRisk']", false);
        questionsYesOrNo("//div[@data-name='ProfessionalIndemnitySoF.TechnologyFinancialSolutions']", false);
        click("//button[@class='btn bbf-button bbf-button-buy DefaultButton']");
    }
    public void reviewpl(){
        questionsYesOrNo("//div[@data-name='PublicLiabilitySoF.PPLCovid']", false);
        click("//button[@class='btn bbf-button bbf-button-buy DefaultButton']");
    }
}

