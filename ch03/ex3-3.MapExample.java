// 코드 3-3 데이터 타입 추론(MapExample.java - mappingType())

Function<String, Integer> bullToIndex = ball -> {
    switch(ball) {
    case "RED":      return 1;
    case "YELLOW":   return 2;
    case "GREEN":    return 3;
    case "BLUE"      return 5;
    default:         return -1;
    }
};

String[] balls = {"RED", "YELLOW", "GREEN", "BLUE"};
Observable<Integer> source = Observable.fromArray(balls)
  .map(ballToIndex);  // 명시적인 타입 변환 없이 바로 사용할 수 있음.
source.subscribe(System.out::println);
