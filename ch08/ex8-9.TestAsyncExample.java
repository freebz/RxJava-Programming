// 코드 8-9 awaitDone() 함수를 활용한 테스트(TestAsyncExample.java - testInterval())

Observable<Integer> source = Observable.interval(100L, TimeUnit.MILLISECONDS)
  .take(5)
  .map(Long::intValue);

source.doOnNext(Log::d)
  .test()
  .awaitDone(1L, TimeUnit.SECONDS)
  .assertResult(0, 1, 2, 3, 4);
