// 코드 3-1 map() 함수 구현(MapExample.java - marbleDiagram())

String[] balls = {"1", "2", "3", "5"};
Observable<String> source = Observable.fromArray(balls)
    .map(ball -> ball + "⋄");
source.subscribe(Log::i);
