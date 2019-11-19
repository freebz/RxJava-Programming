// 코드 3-14 reduce() 함수의 활용 예(ReduceExample.java - marbleDiagram())

String[] balls = {"1", "3", "5"};
Maybe<String> source = Observable.fromArray(balls)
  .reduce((ball1, ball2) -> ball2 + "(" + ball1 + ")");
source.subscribe(System.out::println);
