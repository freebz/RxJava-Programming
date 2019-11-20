// 코드 4-21 reduce() 함수를 scan() 함수로 변경(transform/ScanExample.java - marbleDiagram())

String[] balls = {"1", "3", "5"};
Observable<String> source = Observable.fromArray(balls)
  .scan((ball1, ball2) -> ball2 + "(" + ball1 + ")");
source.subscribe(Log::i);
