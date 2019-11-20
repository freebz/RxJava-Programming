// 코드 4-17 doOnNext() 함수 추가(transform/SwitchMapExample.java - usingDoOnNext())

// 시간을 측정하기 위해 호출.
CommonUtils.exampleStart();

String[] balls = {"1", "3", "5"};
Observable<String> source = Observable.interval(100L, TimeUnit.MILLISECONDS)
  .map(Long::intValue)
  .map(idx -> balls[idx])
  .take(balls.length)
  .doOnNext(Log::dt)  // 중간 결과 확인용 함수.
  .switchMap(
    ball -> Observable.interval(200L, TimeUnit.MILLISECONDS)
      .map(notUsed -> ball + "⋄")
      .take(2)
  );
source.subscribe(Log::it);
CommonUtils.sleep(2000);
