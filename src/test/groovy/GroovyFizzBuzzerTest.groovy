
import sf.projects.fizzbuzz.FizzBuzzer

class GroovyFizzBuzzerTest extends GroovyTestCase {

  FizzBuzzer fb = new FizzBuzzer(3, 5)

  void testFizzBuzz() {
    assert "1" == fb.answer(1)
    assert "22" == fb.answer(22)
    assert "fizz" == fb.answer(3)
    assert "fizz" == fb.answer(9)
    assert "buzz" == fb.answer(5)
    assert "buzz" == fb.answer(20)
    assert "fizz-buzz" == fb.answer(15)
    assert "fizz-buzz" == fb.answer(30)
  }
}
