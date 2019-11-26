// 코드 7-9 Observable.subscribe()를 호출했을 때의 RxJava 내부 코드

public final Disposable subscribe(Consumer<? super T> onNext) {
    return subscribe(onNext, Functions.ON_ERROR_MISSING,
      Functions.EMPTY_ACTION, Functions.emptyConsumer());
}
