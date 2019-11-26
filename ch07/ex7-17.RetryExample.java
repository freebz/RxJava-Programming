// 코드 7-17 대기 시간을 설정한 retry() 함수 예제(RetryExample.java - retryWithDelay())

final int RETRY_MAX = 5;
final int RETRY_DELAY = 1000;

CommonUtils.exampleStart();
String url = "https://api.github.com/zen";
Observable<String> source = Observable.just(url)
  .map(OkHttpHelper::getT)
  .retry((retryCnt, e) -> {
      Log.e("retryCnt = " + retryCnt);
      CommonUtils.sleep(RETRY_DELAY);

      return retryCnt < RETRY_MAX ? true: false;
  })
  .onErrorReturn(e -> CommonUtils.ERROR_CODE);

source.subscribe(data -> Log.it("result : " + data));
