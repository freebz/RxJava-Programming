// 코드 6-11 키 확인 후 정보 분류(fragments/OnClickFragment.java - compareNumbers())

@Override
publici void onActivityCreated(@Nullable Bundle savedInstanceState) {
    getClickEventObservableExtra()
      .map(local -> SEVEN)
      .flatMap(this::compareNumbers)
      .subscribe(this::log);
}

private Observable<String> compareNumbers(int input) {
    return Observable.just(input)
      .flatMap(in -> {
	  Random random = new Random();
	  int data = random.nextInt(10);
	  return Observable.just("local :" + in, "remote : "
	    + data, "result = " + (in == data));
      });
}
