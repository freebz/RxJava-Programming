// 코드 8-8 interval() 함수를 활용하는 테스트(TestAsyncExample.java - testIntervalWrongWay())

@DispalyName("test Observable.interval() wrong")
@Test

// 테스트 코드를 비활성화시키는 경우에는 @Disable을 추가합니다.
@Disable
void testIntervalWrongWay() {
    Observable<Integer> source = Observable.interval(100L, TimeUnit.MILLISECONDS)
      .take(5)
      .map(Long::intValue);

    source.doOnNext(Log::d)
      .test().assertResult(0, 1, 2, 3, 4);
}
