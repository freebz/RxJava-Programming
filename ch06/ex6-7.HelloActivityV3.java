// 코드 6-7 RxLifecycle 라이브러리 활용 예(activities/HelloActivityV3.java - onCreate())

public class HelloActivityV3 extends RxAppCompatActivity {
    public static final String TAG = HelloActivityV3.class.getSimpleName();

    @BindView(R.id.textView) TextView textView;

    private Unbinder mUnbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);

	mUnbinder = ButterKnife.bind(this);

	Observable.just("Hello, rx world!")
	  .compose(bindToLifecycle())
	  .subscribe(textView::setText);
    }

    @Override
    protected void onDestroy() {
	super.onDestroy();
	if (mUnbinder != null) {
	    mUnbinder.unbind();
	}
    }
}
