// 코드 7-8 try-catch 문을 이용한 예외 처리(ExceptionHandling.java - cannotCatch())

Observable<String> source = Observable.create(
  (ObservableEmitter<String> emitter) -> {
      emitter.onNext("1");
      emitter.onError(new Exception("Some Error"));
      emitter.onNext("3");
      emitter.onComplete();
  }
);

try {
    source.subscribe(Log::i);
} catch (Exception e) {
    Log.e(e.getMessage());
}
