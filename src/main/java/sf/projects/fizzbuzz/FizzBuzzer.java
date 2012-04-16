package sf.projects.fizzbuzz;


public class FizzBuzzer
{

  private final int fizzer;
  private final int buzzer;

  public FizzBuzzer(final int fizzer, final int buzzer)
  {
    if (fizzer <= 0 || fizzer > 20)
    {
      throw new IllegalArgumentException("Bad fizz argument: " + fizzer);
    }
    this.fizzer = fizzer;

    if (buzzer <= 0 || buzzer > 20)
    {
      throw new IllegalArgumentException("Bad buzz argument: " + buzzer);
    }
    this.buzzer = buzzer;
  }

  public String answer(final int value)
  {
    final StringBuilder display = new StringBuilder();
    if (value % fizzer == 0)
    {
      display.append("fizz");
    }
    if (value % buzzer == 0)
    {
      if (display.length() > 0)
      {
        display.append("-");
      }
      display.append("buzz");
    }

    if (display.length() == 0)
    {
      display.append(value);
    }

    return display.toString();
  }

}
