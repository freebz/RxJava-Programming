// 코드 2-22 just() 함수에 여러 개 값 넣기(SingleExample.java - errorCase())

Single<String> source = Observable
  .just("Hello Single", "Error").single("default item");
source.subscribe(System.out::println);
