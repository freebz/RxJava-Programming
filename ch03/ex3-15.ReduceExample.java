// 코드 3-15 reduce() 함수의 람다 표현식 분리(ReduceExample.java - biFunction())

BiFunction<String, String, String> mergeBalls =
  (ball1, ball2) -> ball2 + "(" + ball1 + ")";
String[] balls = {"1", "3", "5"};
Maybe<String> source = Observable.fromArray(balls)
  .reduce(mergeBalls);
source.subscribe(System.out::println);
