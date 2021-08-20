import org.scalatest.funsuite.AnyFunSuite

class testSolution105 extends AnyFunSuite {

  test("solution105") {
    assert(solution105.nearest(100, 130) === 100)
    assert(solution105.nearest(-4, -5) === (-4))
    assert(solution105.nearest(50, 70) === (70))

  }

}
