// 코드 5-16 zip() 함수를 활용한 CallbackHeaven 예(examples/CallbackHeaven.java - usingZip())

CommonUtils.exampleStart();

Observable<String> first = Observable.just(FIRST_URL)
  .subscribeOn(Schedulers.io())
  .map(OkHttpHelper::get);
Observable<String> second = Observable.just(SECOND_URL)
  .subscribeOn(Schedulers.io())
  .map(OkHttpHelper::get));

Observable.zip(first, second, (a, b) -> ("\n>> " + a + "\n>> " + b))
  .subscribe(Log::it);

CommonUtils.sleep(5000);
