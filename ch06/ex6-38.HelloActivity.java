// 코드 6-38 Disposable 인터페이스를 이용한 자원 해제(activities/HelloActivity.java)

@BindView(R.id.textView) TextView textView;

private Disposable mDisposable;
private Unbinder mUnbinder;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mUnbinder = ButterKnife.bind(this);

    DisposableObserver<String> observer = new DisposableObserver<String>() {
	@Override
	public void onNext(string s) {
	    textView.setText(s);
	}

	@Override
	public void onError(Throwable e) { }

	@Override
	public void onComplete() { }
    };

    mDisposable = Observable.create(new ObservableOnSubscribe<String>() {
	@Override
	public void subscribe(ObservableEmitter<String> e) throws Exception {
	    e.onNext("Hello world");
	    e.onComplete();
	}
    }).subscribeWith(observer);
}

@Override
protected void onDestroy() {
    super.onDestroy();
    if (!mDisposable.isDisposed()) {
	mDisposable.dispose();
    }
    if (mUnbinder != null) {
	mUnbinder.unbind();
    }
}
