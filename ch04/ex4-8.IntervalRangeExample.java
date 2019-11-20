// 코드 4-8 함수를 조합해 만든 intervalRange() 함수(create/IntervalRangeExample.java - makeWithInterval())

Observable<Long> source = Observable.interval(100L, TimeUnit.MILLISECONDS)
  .map(val -> val + 1)
  .take(5);
source.subscribe(Log::i);
CommonUtils.sleep(1000);
