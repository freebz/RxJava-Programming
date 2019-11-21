// 코드 5-8 싱글 스레드 스케줄러의 활용 예(schedulers/SingleSchedulerExample.java - basic())

Observable<Integer> numbers = Observable.range(100, 5);
Observable<String> chars = Observable.range(0, 5)
  .map(CommonUtils::numberToAlphabet);

numbers.subscribeOn(Schedulers.single())
  .subscribe(Log::i);
chars.subscribeOn(Schedulers.single())
  .subscribe(Log::i);
CommonUtils.sleep(500);
