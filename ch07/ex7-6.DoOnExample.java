// 코드 7-6 doOnLifecycle() 함수로 변환(DoOnExample.java - doOnLifecycle())

String[] orgs = {"1", "3", "5", "2", "6"};
Observable<String> source = Observable.fromArray(orgs)
  .zipWith(Observable.interval(100L, TimeUnit.MILLISECONDS), (a, b) -> a)
  .doOnLifecycle(
    d -> Log.d("onSubscribe()"), () -> Log.d("onDispose()"));
Disposable d = source.subscribe(Log::i);

CommonUtils.sleep(200);
d.dispose();
CommonUtils.sleep(300);
