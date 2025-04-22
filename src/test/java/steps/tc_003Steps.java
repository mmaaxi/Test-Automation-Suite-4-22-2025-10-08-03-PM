package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_003Page;

public class tc_003Steps {

    tc_003Page page;

    @Given("I have a valid compressed file {string}")
    public void i_have_a_valid_compressed_file(String fileName) {
        page = new tc_003Page();
        page.selectCompressedFile(fileName);
    }

    @When("I upload the compressed file")
    public void i_upload_the_compressed_file() {
        page.uploadFile();
    }

    @Then("the system should accept the compressed file")
    public void the_system_should_accept_the_compressed_file() {
        Assert.assertTrue(page.isFileAccepted());
    }

    @When("I confirm the upload")
    public void i_confirm_the_upload() {
        page.confirmUpload();
    }

    @Then("the system should decompress the file")
    public void the_system_should_decompress_the_file() {
        Assert.assertTrue(page.isFileDecompressed());
    }

    @And("the extracted files should be displayed for validation")
    public void the_extracted_files_should_be_displayed_for_validation() {
        Assert.assertTrue(page.areExtractedFilesDisplayed());
    }
}