// 코드 2-3 create() 함수 활용 예(ObservableCreateExample.java - basic())

Observable<Integer> source = Observable.create(
  (ObservableEmitter<Integer> emitter) -> {
    emitter.onNext(100);
    emitter.onNext(200);
    emitter.onNext(300);
    emitter.onComplete();
});
source.subscribe(System.out::println);
