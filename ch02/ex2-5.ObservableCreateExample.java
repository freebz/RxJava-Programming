// 코드 2-5 subscribe() 함수 변경(ObservableCreateExample.java - subscribeLambda())

Observable<Integer> source = Observable.create(
        (ObservableEmitter<Integer> emitter) -> {
    emitter.onNext(100);
    emitter.onNext(200);
    emitter.onNext(300);
    emitter.onComplete();
});
source.subscribe(data -> System.out.println("Result : " + data));
