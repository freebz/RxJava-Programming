// 코드 6-25 interval() 함수를 활용한 Timer 클래스(fragments/PollingFragment.java - startPollingV1())

public class PollingFragment extends Fragment {
    @BindView(R.id.lv_polling_log)
    ListView mLogView;
    Unbinder mUnbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
      @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
	  View layout =
	    inflater.inflate(R.layout.fragment_polling, container, false);
	  mUnbinder = ButterKnife.bind(this, layout);
	  setupLogger();
	  return layout;
    }

    // 중간 생략

    private void startPollingV1() {
	Observable<String> ob = Observable.interval(3, TimeUnit.SECONDS)
	  .flatMap(o -> Observable.just("polling #1"));

	ob.subscribeOn(Schedulers.io())
	  .observeOn(AndroidSchedulers.mainThread())
	  .subscribe(this::log);
    }
    // Log 생략
}
