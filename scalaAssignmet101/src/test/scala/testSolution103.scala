import org.scalatest.funsuite.AnyFunSuite

class testSolution103 extends AnyFunSuite {

  test("solution103") {
    assert(solution103.strReverse("oodMorning") === "goodMorningg")
    assert(solution103.strReverse("Morning") === "gMorningg")
    assert(solution103.strReverse("gg") === "gggg")
  }


}
