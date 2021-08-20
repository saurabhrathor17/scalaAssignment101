import org.scalatest.funsuite.AnyFunSuite

class testSolution106 extends AnyFunSuite {

  test("solution106") {
    assert(solution106.rangeCheck(120, 110) === false)
    assert(solution106.rangeCheck(30, 40) === false)
    assert(solution106.rangeCheck(20, 30) === false)
  }
}
