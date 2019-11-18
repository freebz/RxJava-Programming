// 코 2-2 드isDisposed() 함수 활용 예(ObservableNotifications.java)

Observable<String> source = Observable.just("RED", "GREEN", "YELLOW");

Disposable d = source.subscribe(
    v -> System.out.println("onNext() : value : " + v),
      err -> System.err.println("onError() : err : " + err.getMessage()),
      () -> System.out.println("onComplete()")
);

System.out.println("isDisposed() : " + d.isDisposed());
