package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_008Page;

public class tc_008Steps {
    tc_008Page page = new tc_008Page();

    @Given("a scanned document that requires OCR and MET-IQ processing is loaded")
    public void loadScannedDocument() {
        page.loadScannedDocument();
    }

    @When("the system submits the file to the OCR-METIQ process")
    public void submitFileToOCRMETIQ() {
        page.submitFileToOCRMETIQ();
    }

    @Then("the extracted data should be displayed in less than 30 seconds")
    public void verifyDataExtractionWithinTimeLimit() {
        Assert.assertTrue("Data extraction took longer than 30 seconds", page.isProcessingTimeWithinLimit());
    }

    @Then("the results should be shown without excessive delays")
    public void verifyNoExcessiveDelays() {
        Assert.assertFalse("Excessive delays detected", page.hasExcessiveDelays());
    }
}