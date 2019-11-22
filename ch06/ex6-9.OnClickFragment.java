// 코드 6-9 subscribe() 함수의 인자 변경 1(fragments/OnClickFragment.java - getClickEventObservableWithLambda())

@Override
public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    getClickEventObservableWithLambda()
      .map(s -> "clicked lambda")
      .subscribe(this::log);
}

private Observable<View> getClickEventObservableWithLambda() {
    return Observable.create(s -> mButtonLambda.setOnClickListener(s::onNext));
}
