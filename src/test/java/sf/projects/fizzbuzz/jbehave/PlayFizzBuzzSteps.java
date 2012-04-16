package sf.projects.fizzbuzz.jbehave;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import sf.projects.fizzbuzz.FizzBuzzer;

public class PlayFizzBuzzSteps
{

  private FizzBuzzer fb;
  private String answer;

  @When("I ask to fizz-buzz for <value>")
  @Alias("I ask to fizz-buzz for $value")
  public void answer(@Named("value") final int value)
  {
    answer = fb.answer(value);
  }

  @Given("a fizz-buzz player")
  public void givenAFizzBuzzPlayer()
  {
    fb = new FizzBuzzer(3, 5);
  }

  @Then("I should get a <display>")
  @Alias("I should get a $display")
  public void isBuzz(@Named("display") final String display)
  {
    assertThat(answer, is(display));
  }

}
