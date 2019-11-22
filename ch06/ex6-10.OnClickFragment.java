// 코드 6-10 subscribe() 함수의 인자 변경 2(fragments/OnClickFragment.java - clicks())

@Override
public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    getClickEventObservableWithRxBinding()
      .subscribe(this::log);
}

private Observable<String> getClickEventObservableWithRxBinding() {
    return RxView.clicks(mButtonBinding)
      .map(s -> "Clicked Rxbinding");
}
