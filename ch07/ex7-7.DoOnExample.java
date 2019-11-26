// 코드 7-7 doONTerminate() 함수의 활용 예(DoOnExample.java - doOnTerminate())

String[] orgs = {"1", "3", "5"};
Observable<String> source = Observable.fromArray(orgs);

source.doOnTerminate(() -> Log.d("onTerminate()"))
  .doOnComplete(() -> Log.d("onComplete()"))
  .doOnError(e -> Log.e("onError()", e.getMessage()))
  .subscribe(Log::i);
