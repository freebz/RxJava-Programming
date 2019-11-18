// 코드 2-4 subscribe()를 호출하지 않은 create()(ObservableCreateExample.java - notSubscribed())

Observable<Integer> source = Observable.create(
        (ObservableEmitter<Integer> emitter) -> {
    emitter.onNext(100);
    emitter.onNext(200);
    emitter.onNext(300);
    emitter.onComplete();
});
