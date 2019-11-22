// 코드 6-26 repeatWhen()과 delay() 함수를 활용(fragments/PollingFragment.java - startPollingV2())

private void startPOllingV2() {
    Observable<String> ob2 = Observable.just("polling #2")
      .repeatWhen(o -> o.delay(3, TimeUnit.SECONDS));

    ob2.subscribeOn(Schedulers.io())
      .observeOn(AndroidSchedulers.mainThread())
      .subscribe(this::log);
}
