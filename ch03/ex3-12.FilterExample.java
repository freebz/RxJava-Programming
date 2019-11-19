// 코드 3-12 filter() 함수를 이용한 짝수 필터링(FilterExample.java - evenNumbers())

Integer[] data = {100, 34, 27, 99, 50};
Observable<Integer> source = Observable.fromArray(data)
  .filter(number -> number % 2 == 0);
source.subscribe(System.out::println);
