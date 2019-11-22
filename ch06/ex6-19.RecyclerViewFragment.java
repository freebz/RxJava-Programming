// 코드 6-19 RecycleViewFragment 클래스(fragments/RecycleViewFragment.java - RecyclerViewFragment)

public class RecyclerViewFragment extends Fragment {
    @BindView(R.id.recycler_view) RecyclerView mRecyclerView;

    private RecyclerViewAdapter mRecyclerViewAdapter;
    private Unbinder mUnbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
      @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
	// 내용 입력
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
	super.onActivityCreated(savedInstanceState);

	final LinearLayoutManager layoutManager =
	  new LinearLayoutManager(getActivity());
	mRecyclerView.setLayoutManager(layoutManager);
	mRecyclerViewAdapter = new RecyclerViewAdapter();
	mRecyclerView.setAdapter(mRecyclerViewAdapter);
	mRecyclerViewAdapter
	  .getItemPublishSubject()
	  .subscribe(s -> toast(s.getTitle()));
    }

    @Override
    public void onStart() {
	super.onStart();

	if (mRecyclerViewAdapter == null) {
	    return;
	}

	getItemObservable()
	  .observeOn(AndroidSchedulers.mainThread())
	  .subscribe(item -> {
	      mRecyclerViewAdapter.updateItems(item);
	      mrecyclerviewadapter.notifyDataSetChanged();
	  });
    }

    private void toast(String title) {
	Toast.makeText(getActivity().getApplicationContext(),
	  title,
	  Toast.LENGTH_SHORT).show();
    }
}
