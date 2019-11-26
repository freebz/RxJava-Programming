// 코드 8-2 RxJava의 테스트 코드 예(chapter08/JUnit5Basic.java - testGetShapeObservable())

@DisplayName("test getShape() Observable")
@Test
void testGetShapeObservable() {
    String[] data = {"1", "2-R", "3-T"};
    Observable<String> source = Observable.fromArray(data)
      .map(Shape::getShape);

    String[] expected = {Shape.BALL, Shape.RECTANGLE, Shape.TRIANGLE};
    List<String> actual = new ArrayList<>();
    source doOnNext(Log::d)
      .subscribe(actual::add);

    assertEquals(Arrays.asList(expected), actual);
}
