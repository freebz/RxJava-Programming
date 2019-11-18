// 코드 2-1 just() 함수와 데이터 인자(FirstExample.java - emit())

public class FirstExample {
    public void emit() {
	Observable.just(1, 2, 3, 4, 5, 6)
	.subscribe(System.out::println);
    }
    ...
}
