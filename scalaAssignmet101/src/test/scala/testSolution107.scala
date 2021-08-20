import org.scalatest.funsuite.AnyFunSuite

class testSolution107 extends AnyFunSuite {
  test("solution107") {
    assert(solution107.happyChar(3) === "unhappy")
    assert(solution107.happyChar(2) === "happy")
    assert(solution107.happyChar(1) === "unhappy")

  }

}
