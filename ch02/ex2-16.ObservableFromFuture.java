// 코드 2-16 fromFuture() 함수 활용 예(ObservableFromFuture.java - basic())

Future<String> future = Executors.newSingleThreadExecutor().submit(() -> {
    Thread.sleep(1000);
    return "Hello Future";
});

Observable<String> source = Observable.fromFuture(future);
source.subscribe(System.out::println);
