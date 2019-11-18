// 코드 2-17 fromPublisher() 함수 활용 예(ObservableFromPublisher.java - basic())

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import io.reactivex.Observable;

Publisher<String> publisher = (Subscriber<?> super String> s) -> {
    s.onNext("Hello Observable.fromPublisher()");
    s.onComplete();
};
Observable<String> source = Observable.fromPublisher(publisher);
source.subscribe(System.out::println);
