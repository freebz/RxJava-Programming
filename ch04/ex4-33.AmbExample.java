// 코드 4-33 amb() 함수의 활용 예(conditional/AmbExample.java - marbleDiagram())

String[] data1 = {"1", "3", "5"};
String[] data2 = {"2-R", "4-R"};

List<Observable<String>> sources = Arrays.asList(
  Observable.fromArray(data1)
    .doOnComplete(() -> Log.d("Observable #1 : onComplete()")),
  Observable.fromArray(data2)
    .delay(100L, TimeUnit.MILLISECONDS)
    .doOnComplete(() -> Log.d("Observable #2 : onComplete()"))
);

Observable.amb(sources)
  .doOnComplete(() -> Log.d("Result : onComplete()"))
  .subscribe(Log::i);
CommonUtils.sleep(1000);
