// 코드 7-4 Observer 인터페이스 활용 예(DoOnExample.java - doOnEachObserver())

String[] orgs = {"1", "3", "5"};
Observable<String> source = Observable.fromArray(orgs);

source.doOnEach(new Observer<String>() {
    @Override
    public void onSubscribe(Disposable d) {
        // doOnEach()에서는 onSubscribe() 함수가 호출되지 않습니다.
    }

    @Override
    public void onNext(String value) {
        Log.d("onNext()", value);
    }

    @Override
    public void onError(Throwable e) {
        Log.e("onError()", e.getMessage());
    }

    @Override
    public void onComplete() {
        Log.d("onComplete()");
    }
  })

    .subscribe(Log::i);
