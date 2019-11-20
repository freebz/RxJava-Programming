// 코드 4-39 timeInterval() 함수의 활용 예(etc/TimeIntervalExample.java - marbleDiagram())

String[] data = {"1", "3", "7"};

CommonUtils.exampleStart();
Observable<Timed<String>> source = Observable.fromArray(data)
  .delay(item -> {
      CommonUtils.doSomething();
      return Observable.just(item);
  })
  .timeInterval();

source.subscribe(Log::it);
CommonUtils.sleep(1000);
