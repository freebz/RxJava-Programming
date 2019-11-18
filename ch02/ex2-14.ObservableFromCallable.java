// 코드 2-14 fromCallable() 함수 활용 예(ObservableFromCallable.java - basic())

Callable<String> callable = () -> {
    Thread.sleep(1000);
    return "Hello Callable";
};

Observable<String> source = Observable.fromCallable(callable);
source.subscribe(System.out::println);
