
import sf.projects.fizzbuzz.FizzBuzzer

description "play fizz-buzz"

narrative "while playing fizz-buzz", {
  as_a "fizz-buzz player"
  i_want "to automate my responses"
  so_that "i always win"
}

scenario "fizzing", {
  given "a fizz-buzz player", {
    fb = new FizzBuzzer(3, 5)
  }

  when "3", {
    display = fb.answer(3);
  }
  then "should fizz", { display.shouldBe "fizz" }

  when "6", {
    display = fb.answer(6);
  }
  then "should fizz", { display.shouldBe "fizz" }

  when "9", {
    display = fb.answer(9);
  }
  then "should fizz", { display.shouldBe "fizz" }
}


scenario "buzzing", {
  given "a fizz-buzz player", {
    fb = new sf.projects.fizzbuzz.FizzBuzzer(3, 5)
  }

  when "5", {
    display = fb.answer(5);
  }
  then "should buzz", { display.shouldBe "buzz" }

  when "10", {
    display = fb.answer(10);
  }
  then "should buzz", { display.shouldBe "buzz" }

  when "25", {
    display = fb.answer(25);
  }
  then "should buzz", { display.shouldBe "buzz" }
}


scenario "fizz and buzz with a dash", {
  given "a fizz-buzz player", {
    fb = new sf.projects.fizzbuzz.FizzBuzzer(3, 5)
  }

  when "15", {
    display = fb.answer(15);
  }
  then "should fizz-buzz", { display.shouldBe "fizz-buzz" }

  when "60", {
    display = fb.answer(60);
  }
  then "should fizz-buzz", { display.shouldBe "fizz-buzz" }

  when "90", {
    display = fb.answer(90);
  }
  then "should fizz-buzz", { display.shouldBe "fizz-buzz" }
}
