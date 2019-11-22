// 코드 6-39 RxLifecycle 라이브러리 이용(activities/HelloRxAppActivity.java)

public class HelloRxAppActivity extends RxAppCompatActivity {
    public static final String TAG = HelloRxAppActivity.class.getSimpleName();

    @BindView(R.id.textView) TextView mTextView;
    private Unbinder mUnbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
	mUnbinder = ButterKnife.bind(this);

	Observable.create(new ObservableOnSubscribe<String>() {
	    @Override
	    public void subscribe(ObservableEmitter<String> e) throws Exception {
		e.onNext("Hello world!");
		e.onComplete();
	    }
	})
	  // .compose(bindToLiftcycle())
	  .compose(bindUntilEvent(ActivityEvent.DESTROY))
	  .subscribe(mTExtView::setTExt);
    }

    @Override
    protected void onDestroy() {
	super.onDestroy();
	if (mUnbinder != null) {
	    mUnbinder.unbind();
	}
    }
}
