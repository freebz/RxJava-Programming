// 코드 6-37 MainActivity 클래스의 텍스트 뷰(activities/HelloActivity.java - create())

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

Observable create(new ObservableOnSubscribe<String>() {
    @Override
    public void subscribe(ObservableEmitter<String> e) throws Exception {
	e.onNext("hello world!");
	e.onComplete();
    }
}).subscribe(observer);
