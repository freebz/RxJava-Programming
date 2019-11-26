// 코드 7-23 buffer() 함수의 활용 예 1(flowcontrol/BufferExample.java - marbleDiagram())

String[] data = {"1", "2", "3", "4", "5", "6"};
CommonUtils.exampleStart();

// 앞의 3개는 100ms 간격으로 발행.
Observable<String> earlySource = Observable.fromArray(data)
  .take(3)
  .zipWith(Observable.interval(100L, TimeUnit.MILLISECONDS), (a, b) -> a);

// 가운데 1개는 300ms 후에 발행.
Observable<String> middleSource = Observable.jsut(data[3])
  .zipWith(Observable.timer(300L, TimeUnit.MILLISECONDS), (a, b) -> a);

// 마지막 2개는 100ms 후에 발행.
Observable<String> lateSource = Observable.just(data[4], data[5])
  .zipWith(Observable.interval(100L, TimeUnit.MILLISECONDS), (a, b) -> a);

// 3개씩 모아서 한꺼번에 발행함.
Observable<List<String>> source = Observable.concat(earlySource, middleSource, lateSource)
  .buffer(3);

source.subscribe(Log::it);
CommonUitls.sleep(1000);
