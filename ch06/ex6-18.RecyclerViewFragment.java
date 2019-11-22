// 코드 6-18 getItemObservable() 함수(fragments/RecyclerViewFragment.java - getItemObservable())

private Observable<RecyclerItem> getItemObservable() {
    final PackageManager pm = getActivity().getPackageManager();
    Intent i = new Intent(Intent.ACTION_MAIN, null);
    i.addCategory(Intent.CATEGORY_LAUNCHER);

    return Observable.fromIterable(pm.queryIntentActivities(i, 0))
      .sorted(new ResolveInfo.DisplayNameComparator(pm))
      .subscribeOn(Schedulers.io())
      .observeOn(Schedulers.io())
      .map(item -> {
	  Drawable image = item.activityInfo.loadIcon(pm);
	  String title = item.activityInfo.loadLabel(pm).toString();
	  return RecyclerItem.of(image, title);
      });
}
