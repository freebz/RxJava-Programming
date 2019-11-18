// 코드 2-15 람다 표현식이 없는 fromCallable() 함수(ObservableFromCallable.java - withoutLambda())

Callable<String> callable = new Callable<String> {
    @Override
    public String call() throws Exception {
	Thread.sleep(1000);
	return "Hello Callable";
    }
};

Observable<String> source = Observable.fromCallable(callable);
source.subscribe(System.out::println);
