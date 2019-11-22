// 코드 6-21 RxAndroid를 이용한 스케줄러(AsyncTaskActivity.java - initRxAsync())

private void initRxAsync() {
    Observable.just("Hello", "rx", "world")
      .reduce((x,y) -> x + " " + y)
      .observeOn(AndroidSchedulers.mainThread())
      // .subscribe(getObserver());
      .subscribe(
	mxRxTextView::setText,
	e -> Log.e(TAG, e.getMessage()),
	() -> Log.i(TAG, "done")
      );
}

private MaybeObserver<String> getObserver() {
    return new MaybeObserver<String>() {
	@Override
	public void onSubscribe(Disposable d) { }

	@Override
	public void onSuccess(String result) {
	    mRxTextView.setText(result);
	}

	@Override
	public void onError(Throwable e) {
	    Log.e(TAG, e.getMessage());
	}

	@Override
	public void onComplete() {
	    Log.i(TAG, "done");
	}
    };
}
