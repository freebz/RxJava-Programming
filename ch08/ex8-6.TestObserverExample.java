// 코드 8-6 assertFailureAndMessage() 함수의 활용 예(TestObserverExample.java - assertFailureAndMessage())

@DisplayName("assertFailureAndMessage() example")
@Test
void assertFailureAndMessage() {
    String[] data = {"100", "200", "%300"};
    Observable<Integer> source = Observable.fromArray(data)
      .map(Integer::parseInt);

    source.test().assertFailureAndMessage(NumberFormatException.class,
      "For input string: \"%300\"", 100, 200);
}
