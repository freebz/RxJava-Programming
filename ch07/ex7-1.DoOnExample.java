// 코드 7-1 doOnNext(), doOnComplete(), doOnError() 함수의 활용 예(DoOnExample.java - basic())

String[] orgs = {"1", "3", "5"};
Observable<String> source = Observable.fromArray(orgs);

source.doOnNext(data -> Log.d("onNext()", data))
  .doOnComplete(() -> Log.d("onComplete()"))
  .doOnError(e -> Log.e("onError()", e.getMessage()))
  .subscribe(Log::i);
