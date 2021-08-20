import org.scalatest.funsuite.AnyFunSuite

class testSolution102 extends AnyFunSuite {
  test("solution4") {
    assert(solution102.stringRemove("Scala", 0) === "cala")
    assert(solution102.stringRemove("Scala", 1) === "Sala")
    assert(solution102.stringRemove("Scala", 4) === "Scal")
  }

}
