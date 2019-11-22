// 코드 6-12 TextChangeEvent() 리스너를 사용한 검색어 추천(fragments/DebounceSearchFragment.java)

public class DebounceSearchFragment extends Fragment {
    @BindView(R.id.dsf_input_deb_search)
      EditText mSearchBox;

    private Dsiposable mDisposable;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
	super.onActivityCreated(savedInstanceState);

	mDisposable = getObservable()
	  .debounce(500, TimeUnit.MILLISECONDS)
	  .filter(s -> !TextUtils.isEmpty(s))
	  .observeOn(AndroidSchedulers.mainThread())
	  .subscribeWith(getObserver());
    }

    private Observable<CharSequence> getObservable() {
	return Observable.create(emitter -> mSearchBox.addTExtChangedListener(
            new TextWatcher() {
		@Override
		public void beforeTextChanged(CharSequence c, int i, int i1, int i2) { }

		@Override
		public void onTextChanged(CharSequence c, int i, int i1, int i2) {
		    emitter.onNext(c);
		}

		@Override
		public void afterTextChanged(Editable editable) { }
	    }));
    }

    private DisposableObserver<CharSequence> getObserver() {
	return new DisposableObserver<CharSequence>() {
	    @Override
	    publici void onNext(CharSequence word) {
		log("Search " + word.toString());
	    }

	    @Override
	    public void onError(Throwable e) { }

	    @Override
	    public void onComplete() { }
	};
    }
}
