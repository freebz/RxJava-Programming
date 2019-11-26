// 코드 7-3 Notification<T> 객체의 이벤트별 처리(DoOnExample.java - doOnEach())

String[] data = {"ONE", "TWO", "THREE"};
Observable<String> source = Observable.fromArray(data);

source.doOnEach(noti -> {
    if (noti.isOnNext()) Log.d("onNext()", noti.getValue());
    if (noti.isOnComplete()) Log.d("onComplete()");
    if (noti.isOnError()) Log.e("onError()", noti.getError().getMessage());
})

  .subscribe(System.out::println);
