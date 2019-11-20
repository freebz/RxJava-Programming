// 코드 4-25 시간 결합(combine/ZipExample.java - zipInterval())

Observable<String> source = Observable.zip(
  Observable.just("RED", "GREEN", "BLUE"),
  Observable.interval(200L, TimeUnit.MILLISECONDS),
  (value,i) -> value);

CommonUtils.exampleStart();
source.subscribe(Log::it);
CommonUtils.sleep(1000);
