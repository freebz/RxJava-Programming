// 코드 4-7 intervalRange() 함수의 활용 예(create/IntervalRangeExample.java - printNumbers())

Observable<Long> source = Observable.intervalRange(1,    // start
  5,                                                     // count
  100L,                                                  // initialDelay
  100L,                                                  // period
  TimeUnit.MILLISECONDS);                                // unit
source.subscribe(Log::i);
CommonUtils.sleep(1000);
