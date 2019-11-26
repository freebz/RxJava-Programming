// 코드 7-16 retry() 함수의 활용 예 1(RetryExample.java - retry5())

// 시간 표시용.
CommonUtils.exampleStart();

String url = "https://api.github.com/zen";
Observable<String> source = Observable.just(url)
  .map(OkHttpHelper::getT)
  .retry(5)
  .onErrorReturn(e -> CommonUtils.ERROR_CODE);

source.subscribe(data -> Log.it("result : " + data));
