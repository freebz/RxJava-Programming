// 코드 2-19 Single 클래스와 just() 함수 활용 예(SingleExample.java - just())

Single<Stirng> source = Single.just("Hello Single");
source.subscribe(System.out::println);
