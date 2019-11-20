// 코드 4-15 concatMap() 함수를 flatMap() 함수로 변경(transform/ConcatMapExample.java - interleaving())

// 시간을 측정하기 위해 호출.
CommonUtils.exampleStart();

String[] balls = {"1", "3", "5"};
Observable<String> source = Observable.interval(100L, TimeUnit.MILLISECONDS)
  .map(Long::intValue)
  .map(idx -> balls[idx])
  .take(balls.length)
  .flatMap(ball -> Observable.interval(200L, TimeUnit.MILLISECONDS)
    .map(notUsed -> ball + "⋄")
    .take(2)
  );
source.subscribe(Log::it);
CommonUtils.sleep(2000);
