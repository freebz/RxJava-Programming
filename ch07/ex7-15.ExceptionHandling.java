// 코드 7-15 onErrorResumeNext() 함수의 활용(ExceptionHandling.java - onErrorResumeNext())

String[] salesData = {"100", "200", "A300"}; // A300은 에러 데이터.
Observable<Integer> onParseError = Observable.defer(() -> {
    Log.d("send email to administrator");
    return Observable.just(-1);
}).subscribeOn(Schedulers.io()); // IO 스케줄러에서 실행됨.

Observable<Integer> source = Observable.fromArray(salesData)
  .map(Integer::parseInt)
  .onErrorResumeNext(onParseError);

source.subscribe(data -> {
    if (data < 0) {
        Log.e("Wrong Data found!!");
	return;
    }

    Log.i("Sales data : " + data);
});
