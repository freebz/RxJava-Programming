// 코드 7-21 sample() 함수의 활용 예(flowcontrol/SampleExample.java - marbleDiagram())

String[] data = {"1", "7", "2", "3", "6"};

// 시간 측정용.
CommonUtils.exampleStart();

// 앞의 4개는 100ms 간격으로 발행.
Observable<String> earlySource = Observable.fromArray(data)
  .take(4)
  .zipWith(Observable.interval(100L, TimeUnit.MILLISECONDS), (a, b) -> a);

// 마지막 데이터는 300ms 후에 발행.
Observable<String> lateSource = Observable.just(data[4])
  .zipWith(Observable.timer(300L, TimeUnit.MILLISECONDS), (a, b) -> a);

// 2개의 Observable을 결합하고 300ms로 샘플링.
Observable<String> source = Observable.concat(earlySource, lateSource)
  .sample(300L, TimeUnit.MILLISECONDS);

source.subscribe(Log::it);
CommonUtils.sleep(1000);
