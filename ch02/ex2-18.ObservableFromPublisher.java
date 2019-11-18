// 코드 2-18 람다 표현식이 없는 fromPublisher() 함수(ObservableFromPublisher.java - withoutLambda())

Publisher<String> publisher = new Publisher<String>() {
    @Override
    public void subscribe(Subscriber<?> super String> s) {
	s.onNext("Hello Observable.fromPublisher()");
	s.onComplete();
    }
};
Observable<String> source = Observable.fromPublisher(publisher);
source.subscribe(System.out::println);
