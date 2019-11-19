// 코드 3-2 Function 인터페이스를 적용한 map() 함수(MapExample.java - mapFunction())

Function<String, String> getDiamond = ball -> ball + "⋄";

String[] balls = {"1", "2", "3", "5"};
Observable<String> source = Observable.fromArray(balls)
  .map(getDiamond);
source.subscribe(Log::i);
