// 코드 4-35 skipUntil() 함수의 활용 예(conditional/SkipUntilExample.java - marbleDiagram())

String[] data = {"1", "2", "3", "4", "5", "6"};

Observable<String> source = Observable.fromArray(data)
  .zipWith(Observable.interval(100L, TimeUnit.MILLISECONDS), (val, notUsed) -> val)
  .skipUntil(Observable.timer(500L, TimeUnit.MILLISECONDS));

source.subscribe(Log::i);
CommonUtils.sleep(1000);
