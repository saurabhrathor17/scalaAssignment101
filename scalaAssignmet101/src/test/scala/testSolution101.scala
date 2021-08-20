import org.scalatest.funsuite.AnyFunSuite

class testSolution101 extends AnyFunSuite {

  test("solution101") {
    assert(solution101.stringProb("India") === "InInInIn")
    assert(solution101.stringProb("america") == "amamamam")
    assert(solution101.stringProb("a") == "a")

  }
}
