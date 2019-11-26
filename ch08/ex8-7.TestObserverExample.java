// 코드 8-7 assertComplete() 함수의 활용 예(TestObserverExample.java - assertComplete())

@DispalyName("assertComplete() example")
@Test
void assertComplete() {
    Observable<String> source = Observable.create(
	(ObservableEmitter<String> emitter) -> {
	    emitter.onNext("Hello RxJava");
	    emitter.onComplete();
	}
    );
    source.test().assertComplete();
}
