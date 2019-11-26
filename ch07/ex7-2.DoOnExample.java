// 코드 7-2 onError 이벤트 확인(DoONExmaple.java - withError())

// 0으로는 나눌 수 없다.
Integer[] divider = {10, 5, 0};

Observable.fromArray(divider)
  .map(div -> 1000 / div)
  .doOnNext(data -> Log.d("onNext()", data))
  .doONComplete(() -> Log.d("onComplete()"))
  .doOnError(e -> Log.e("onError()", e.getMessage()))
  .subscribe(Log::i);
