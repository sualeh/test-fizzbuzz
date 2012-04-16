import sf.projects.fizzbuzz.FizzBuzzer
import spock.lang.*

class SpockFizzBuzzerTest extends Specification {

  def "test fizz-buzz player"() {
    given:
    FizzBuzzer fb = new FizzBuzzer(3, 5)

    expect:
    fb.answer(number) == display

    where:
    number << [
      1,
      2,
      3,
      4,
      5,
      6,
      7,
      8,
      9,
      10,
      15
    ]
    display << [
      "1",
      "2",
      "fizz",
      "4",
      "buzz",
      "fizz",
      "7",
      "8",
      "fizz",
      "buzz",
      "fizz-buzz"
    ]
  }
}
