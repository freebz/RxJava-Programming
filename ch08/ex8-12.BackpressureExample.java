// 코드 8-12 배압 상황 발생(BackpressureExample.java - makeBackpressure())

// 시간을 측정하기 위해 호출함.
CommonUtils.exampleStart();

PublishSubject<Integer> subject = PublishSubject.create();
subject.observeOn(Schedulers.computation())
  .subscribe(data -> {
      CommonUtils.sleep(100); // 100ms 후 데이터를 처리함.
      Log.it(data);
  }, err -> Log.e(err.toString()));

// 뜨거운 Observable로 50,000,000개의 데이터를 연속으로 발행함.
for(int i = 0; i <50_000_000; ++) {
    subject.onNext(i);
}
subject.onComplete();
