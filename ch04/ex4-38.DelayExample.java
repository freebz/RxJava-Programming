// 코드 4-38 delay() 함수의 활용 예(etc/DelayExample.java - marbleDiagram())

String[] data = {"1", "7", "2", "3", "4"};
Observable<String> source = Observable.fromArray(data)
  .delay(100L, TimeUnit.MILLISECONDS);
source.subscribe(Log::i);
CommonUtils.sleep(1000);
