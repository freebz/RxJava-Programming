// 코드 8-13 onBackpressureBuffer() 함수의 활용 예(BackpressureExample.java - usingBuffer())

// 시간을 측정하기 위해 호출함.
CommonUtils.exampleStart();

Flowable.range(1, 50_000_000)
  .onBackpressureBuffer(128, () -> {}, BackpressureOverflowStrategy.DROP_OLDEST)
  .observeOn(Schedulers.computation())
  .subscribe(data -> {
      CommonUtils.sleep(100); // 100ms 후 데이터를 처리함.
      Log.it(data);
  }, err -> Log.e(err.toString()));
