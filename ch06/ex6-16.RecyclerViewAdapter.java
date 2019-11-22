// 코드 6-16 ViewHolder 클래스(fragments/RecyclerViewAdapter.java - RecyclerView.ViewHolder)

class MyViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.item_image)
    ImageView mImage;

    @BindView(R.id.item_title)
    TextView mTitle;

    private MyViewHolder(View itemView) {
	super(itemView);
	ButterKnife.bind(this, itemView);
    }

    Observable<RecyclerItem> getClickObservable(RecyclerItem item) {
	return Observable.create(e -> itemView.setOnClickListener(
	  view -> e.onNext(item)));
    }
}
