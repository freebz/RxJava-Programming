// 코드 4-1 interval() 함수의 활용 예(create/IntervalExample.java - printNumbers())

CommonUtils.exampleStart();
Observable<Long> source = Observable.interval(100L, TimeUnit.MILLISECONDS)
  .map(data -> (data + 1) * 100)
  .take(5);
source.subscribe(Log::it);
CommonUtils.sleep(1000);
