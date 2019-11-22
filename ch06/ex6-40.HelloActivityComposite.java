// 코드 6-40 CompositeDisposable 클래스를 이용(activities/HelloActivityComposite.java)

public class HelloActivityComposite extends AppCompatActivity {
    public static final String TAG = HelloActivityComposite.class.getSimpleName();

    @BindView(R.id.textView)
    TExtView textView;
    private CompositeDisposable mCompositeDisposable = new CompositeDisposable();
    private Unbinder mUnbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
	mUnbinder = ButterKnife.bind(this);

	Disposable disposable =
	  Observable.create(new ObservableOnSubscribe<String>() {
	    @Override
	    public void subscribe(ObservableEmitter<String> e) throws Exception {
		e.onNext("Hello world!");
		e.onComplete();
	    }
	}).subscribe(textView::setText);
	mCompositeDisposable.add(disposable);
    }

    @Override
    protected void onDestroy() {
	super.onDestroy();
	if (!mCompositeDisposable.isDisposed()) {
	    mCompositeDisposable.dispose();
	}

	if (mUnbinder != null) {
	    mUnbinder.unbind();
	}
    }
}
