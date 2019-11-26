// 코드 7-5 doOnSubscribe()와 doOnDispose()의 활용(DoOnExample.java - doOnSubscribeAndDispose())

String[] orgs = {"1", "3", "5", "2", "6"};
Observable<String> source = Observable.fromArray(orgs)
  .zipWith(Observable.interval(100L, TimeUnit.MILLISECONDS), (a, b) -> a)
  .doOnSubscribe(d -> Log.d("onSubscribe()"))
  .doOnDispose(() -> Log.d("onDispose()"));
Disposable d = source.subscribe(Log::i);

CommonUtils.sleep(200);
d.dispose();
CommonUtils.sleep(300);
