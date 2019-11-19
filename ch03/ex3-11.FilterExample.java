// 코드 3-11 filter() 함수의 활용 예(FilterExample.java - marbleDiagram())

String[] objs = {"1 CIRCLE", "2 DIAMOND", "3 TRIANGLE",
  "4 DIAMOND", "5 CIRCLE", "6 HEXAGON"};
Observable<String> source = Observable.fromArray(objs)
  .filter(obj -> obj.endsWith("CIRCLE"));
source.subscribe(System.out::println);
