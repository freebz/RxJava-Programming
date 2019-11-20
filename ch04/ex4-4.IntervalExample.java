// 코드 4-4 interval() 함수의 두 번째 원형 활용 예(create/IntervalExample.java - noInitialDelay())

CommonUtils.exampleStart();
Observable<Long> source = Observable.interval(0L, 100L, TimeUnit.MILLISECONDS)
  .map(data -> (data + 1) * 100)
  .take(5);
source.subscribe(Log::it);
CommonUtils.sleep(1000);
