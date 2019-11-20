// 코드 4-5 timer() 함수의 활용 예(create/TimerExample.java - showTime())

CommonUtils.exampleStart();
Observable<Long> source = Observable.timer(500L, TimeUnit.MILLISECONDS)
  .map(notUsed -> {
      return new SimpleDateFormat("yyyy/MM/dd HH;mm:ss")
      .format(new Date());
    });
source.subscribe(Log::it);
CommonUtils.sleep(1000);
