// 코드 7-20 retryWhen() 함수의 활용 예(RetryExample.java - retryWhen())

Observable.create((ObservableEmitter<String> emitter) -> {
    emitter.onError(new RuntimeException("always fails"));
}).retryWhen(attempts -> {
    return attempts.zipWith(Observable.range(1, 3), (n, i) -> i)
      .flatMap(i -> {
	  Log.d("delay retry by " + i + " seconds");
	  return Observable.timer(i, TimeUnit.SECONDS);
      }
    );
}).blockingForEach(Log::d);
