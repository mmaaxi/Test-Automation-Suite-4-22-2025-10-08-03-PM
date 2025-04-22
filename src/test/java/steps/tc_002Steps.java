package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_002Page;
import org.junit.Assert;

public class tc_002Steps {
    tc_002Page uploadPage = new tc_002Page();
    
    @Given("I am on the file upload page")
    public void i_am_on_the_file_upload_page() {
        uploadPage.navigateToUploadPage();
    }

    @When("I try to upload a file larger than 50MB")
    public void i_try_to_upload_a_file_larger_than_50MB() {
        uploadPage.uploadLargeFile();
    }

    @Then("I should see an error message")
    public void i_should_see_an_error_message() {
        Assert.assertTrue(uploadPage.isErrorMessageDisplayed());
    }
    
    @Then("the error message should indicate the file size exceeds the limit")
    public void the_error_message_should_indicate_the_file_size_exceeds_the_limit() {
        String expectedMessage = "The file size exceeds the limit of 50MB";
        Assert.assertEquals(expectedMessage, uploadPage.getErrorMessage());
    }
}