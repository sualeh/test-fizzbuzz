package sf.projects.fizzbuzz.junit;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import sf.projects.fizzbuzz.FizzBuzzer;

@RunWith(Parameterized.class)
public class FizzBuzzerParameterizedTest
{

  @Parameters
  public static Collection<Object[]> generateData()
  {
    return Arrays.asList(new Object[] {
        1, "1"
    }, new Object[] {
        3, "fizz"
    }, new Object[] {
        5, "buzz"
    }, new Object[] {
        15, "fizz-buzz"
    });
  }

  private final FizzBuzzer fb = new FizzBuzzer(3, 5);
  private final int value;
  private final String answer;

  public FizzBuzzerParameterizedTest(final int value, final String answer)
  {
    this.value = value;
    this.answer = answer;
  }

  @Test
  public void checkAnswer()
  {
    assertThat(fb.answer(value), is(answer));
  }

}
