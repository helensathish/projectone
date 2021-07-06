public class SeleniumTest extends Core {
    public void test1() throws InterruptedException {
        setDriver();
        StepOne first = new StepOne();
        first.one("IT Contractor");
        Steptwo piyes = new Steptwo();
        piyes.twopiyes();
        Steptwo plno = new Steptwo();
        plno.twoplno();
        QuotePage three = new QuotePage();
        three.quote();
        ReviewPage four = new ReviewPage();
        four.review();
        ReviewPage revpi = new ReviewPage();
        revpi.reviewpi();
        SummaryPage five = new SummaryPage();
        five.summary();
        PayPage six = new PayPage();
        String pol = six.pay();
        setDriver1();
        Merlin merln = new Merlin();
        merln.merlin(pol);
        }
    public void test2() throws InterruptedException {
        setDriver();
        StepOne first = new StepOne();
        first.one("IT facilities management");
        Steptwo pino= new Steptwo();
        pino.twopino();
        Steptwo plyes = new Steptwo();
        plyes.twoplyes();
        QuotePage three = new QuotePage();
        three.quote();
        ReviewPage four = new ReviewPage();
        four.review();
        ReviewPage revpl = new ReviewPage();
        revpl.reviewpl();
        SummaryPage five = new SummaryPage();
        five.summary();
        PayPage six = new PayPage();
        String pol = six.pay();
        setDriver1();
        Merlin merln = new Merlin();
        merln.merlin(pol);
    }
    public void test3() throws InterruptedException {
        setDriver();
        StepOne first = new StepOne();
        first.one("IT Consultancy");
        Steptwo piyes= new Steptwo();
        piyes.twopiyes();
        Steptwo plyes = new Steptwo();
        plyes.twoplyes();
        QuotePage three = new QuotePage();
        three.quote();
        ReviewPage four = new ReviewPage();
        four.review();
        ReviewPage revpi = new ReviewPage();
        revpi.reviewpi();
        ReviewPage revpl = new ReviewPage();
        revpl.reviewpl();
        SummaryPage five = new SummaryPage();
        five.summary();
        PayPage six = new PayPage();
        String pol = six.pay();
        setDriver1();
        Merlin merln = new Merlin();
        merln.merlin(pol);
    }

    public static void main(String[] args) throws InterruptedException {
        SeleniumTest s1 = new SeleniumTest();
        s1.test1();
        SeleniumTest s2 = new SeleniumTest();
        s2.test2();
        SeleniumTest s3 = new SeleniumTest();
        s3.test3();
    }
}