// 코드 3-4 flatMap() 함수 활용 예(FlatMapExample.java - marbleDiagram())

// 함수를 별도로 정의하는 것이 가장 먼저 겪어야 할 관문임.
Function<String, Observable<String>> getDoubleDiamonds =
  ball -> Observable.just(ball + "⋄", ball + "⋄");

String[] balls = {"1", "3", "5"};
Observable<String> source = Observable.fromArray(balls)
  .flatMap(getDoubleDiamonds);
source.subscribe(Log::i);
