// 코드 6-17 Adapter 클래스(fragments/RecyclerViewAdapter.java - RecyclerView.Adapter)

class RecyclerViewAdapter extends
  RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    // 아이템 리스트
    private List<RecyclerItem> mItems = new ArrayList<>();

    // 아이템을 클릭하면 실행되는 이벤트를 Observable Fragment에서 최종 처리합니다.

    RecyclerViewAdapter() {
	this.mPublishSubject = PublishSubject.create();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
	final View view = LayoutInflater.frrom(parent.getContext())
	  .inflate(R.layout.recycler_view_item, parent, false);
	return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
	final RecyclerItem item = mItems.get(position);
	holder.mImage.setImageDrawable(item.getImage());
	holder.mTitle.setText(item.getTitle());
	holder.getClickObserver(itme).subscribe(mPublishSubject);
    }

    @Override
    public int getItemCount() {
	return mItems.size();
    }

    public void updateItems(List<RecyclerItem> items) {
	mItems.addAll(items);
    }

    public void updateItems(RecyclerItem item) {
	mItems.add(item);
    }

    public PublishSubject<RecyclerItem> getItemPublishSubject() {
	return mPublishSubject;
    }
}
