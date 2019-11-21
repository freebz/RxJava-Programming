// 코드 5-15 RxJava의 스케줄러를 활용한 URL 호출(examples/CallbackHeaven.java - usingConcat())

CommonUtils.exampleStart();
Observable<String> source = Observable.just(FIRST_URL)
  .subscribeOn(Schedulers.io())
  .map(OkHttpHelper::get)
  .concatWith(Observable.just(SECOND_URL)
    .map(OkHttpHelper::get));
source.subscribe(Log::it);
CommonUtils.sleep(5000);
