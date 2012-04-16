package sf.projects.fizzbuzz.junit;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import sf.projects.fizzbuzz.FizzBuzzer;

public class FizzBuzzerTest
{

  private static final int BUZZER = 5;
  private static final int FIZZER = 3;

  private final FizzBuzzer fb = new FizzBuzzer(FIZZER, BUZZER);

  @Test(expected = IllegalArgumentException.class)
  public void constructor1()
  {
    new FizzBuzzer(-FIZZER, BUZZER);
  }

  @Test(expected = IllegalArgumentException.class)
  public void constructor2()
  {
    new FizzBuzzer(FIZZER, -BUZZER);
  }

  @Test(expected = IllegalArgumentException.class)
  public void constructor3()
  {
    new FizzBuzzer(0, BUZZER);
  }

  @Test(expected = IllegalArgumentException.class)
  public void constructor4()
  {
    new FizzBuzzer(FIZZER, 0);
  }

  @Test
  public void range()
    throws Exception
  {
    for (int i = -1000; i < 1001; i++)
    {
      if (i % FIZZER == 0)
      {
        assertTrue(fb.answer(i).contains("fizz"));
      }
      if (i % BUZZER == 0)
      {
        assertTrue(fb.answer(i).contains("buzz"));
      }
      if (i % FIZZER > 0 && i % BUZZER > 0)
      {
        assertFalse(fb.answer(i).contains("buzz"));
        assertFalse(fb.answer(i).contains("fizz"));
      }
    }
  }

}
