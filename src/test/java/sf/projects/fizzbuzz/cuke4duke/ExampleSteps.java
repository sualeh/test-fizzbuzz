package sf.projects.fizzbuzz.cuke4duke;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import cuke4duke.annotation.I18n.EN.Given;
import cuke4duke.annotation.I18n.EN.Then;
import cuke4duke.annotation.I18n.EN.When;
import cuke4duke.annotation.Pending;

public class ExampleSteps
{

  private char theLetter;

  @Then("^the letter should be '([A-Za-z])'$")
  @Pending
  public void checkTheLetter(final char aLetter)
  {
    assertThat(theLetter, is(aLetter));
  }

  @When("^I check the letter(?:s)?$")
  @Pending
  public void checkThem()
  {
    // just a stub
  }

  @Given("^the letter '([A-Za-z])'$")
  @Pending
  public void gimmeALetter(final char theLetter)
  {
    this.theLetter = theLetter;
  }

}
