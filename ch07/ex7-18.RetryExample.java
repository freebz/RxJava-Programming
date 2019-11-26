// 코드 7-18 retryUntil() 함수의 활용 예(RetryExample.java - retryUntil())

// 시간 표시용.
CommonUtils.exampleStart();

String url = "https://api.github.com/zen";
Observable<String> source = Observable.just(url)
  .map(OkHttpHelper::getT)
  .subscribeOn(Schedulers.io())
  .retryUntil(() -> {
      if(CommonUtils.isNetworkAvailable())
	  return true;  // 중지

      CommonUtils.sleep(1000);
      return false;     // 계속 진행
  });
source.subscribe(Log::i);

// IO 스케줄러에서 실행되기 때문에 sleep() 함수가 필요함.
CommonUtils.sleep(5000);
