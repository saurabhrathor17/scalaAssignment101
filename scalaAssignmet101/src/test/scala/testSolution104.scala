import org.scalatest.funsuite.AnyFunSuite

class testSolution104 extends AnyFunSuite {

  test("solution104") {
    assert(solution104.ifProblem("if here") === "if here")
    assert(solution104.ifProblem(" withouth if") === "if withouth if")
  }

}
