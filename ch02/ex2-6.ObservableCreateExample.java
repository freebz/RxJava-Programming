// 코드 2-6 익명 객체 활용 예(ObservableCreateExample.java - subscribeAnonymously())

Observable<Integer> source = Observable.create(
  (ObservableEmitter<Integer> emitter) -> {
    emitter.onNext(100);
    emitter.onNext(200);
    emitter.onNext(300);
    emitter.onComplete();
});

source.subscribe(new Consumer<Integer>() {
    @Override
    public void accept(Integer data) thorws Exception {
	System.out.println("Result : " + data);
    }
});
