// 코드 6-2 hello world 예제(activities/HelloActivityV1.java - create())

Observer<String> observer = new DisposableObserver<String>() {
    @Override
    public void onNext(String s) {
	textView.setText(s);
    }
    @Override
    public void onError(Throwable e) { }
    @Override
    public void onComplete() { }
};

Observable.create(new ObservableOnSubscribe<String>() {
    @Override
    public void subscribe(ObservableEmitter<String> e) throws Exception {
	e.onNext("Hello world!");
	e.onComplete();
    }
}).subscribe(observer);
