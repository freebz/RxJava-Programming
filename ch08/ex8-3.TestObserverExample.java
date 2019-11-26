// 코드 8-3 TestObserver를 활용한 테스트(TestObserverExample.java - testGetShapeUsingTestObserver())

@DisplayName("#1: using TestObserver for Shape.getShape()")
@Test
void testGetShapeUsingTestObserver() {
    String[] data = {"1", "2-R", "3-T"};
    Observable<String> source = Observable.fromArray(data)
      .map(Shape::getShape);

    String[] expected = {Shape.BALL, Shape.RECTANGLE, Shape.TRIANGLE};
    source.test().assertResult(expected);
}
