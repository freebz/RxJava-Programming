// 코드 8-5 assertFailure() 함수의 활용 예(TestObserverExample.java - assertFailureExample())

@DisplayName("assertFailure() example")
@Test
void assertFailureExample() {
    String[] data = {"100", "200", "%300"};
    Observable<Integer> source = Observable.fromArray(data)
      .map(Integer::parseInt);

    source.test().assertFailure(NumberFormatException.class, 100, 200);
}
