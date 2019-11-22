// 코드 6-8 onClick()의 Observable 활용 예(fragments/OnClickFragment.java - getClickEventObservable())

public class OnClickFragment extends Fragment {
    public static final String TAG = OnClickFragment.class.getSimpleName();

    @BindView(R.id.btn_click_observer)
      Button mButton;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
	getClickEventObservable()
	  .map(s -> "clicked")
	  .subscribe(getObserver());
    }

    private Observable<View> getClickEventObservable() {
	return Observable.create(new ObservableOnSubscribe<View>() {
	    @Override
	    public void subscribe(ObservableEmitter<View> e) throws Exception {
		mButton.setOnClickListener(e::onNext);
	    }
        });
    }

    private DisposableObserver<? super String> getObserver() {
	return new DisposableObserver<String>() {
	    @Override
	    public void onNext(String s) { log(s); }

	    @Override
	    public void onError(Throwable e) { log(e.getMessage()); }

	    @Override
	    public void onComplete() { log("complete"); }
	};
    }
}
