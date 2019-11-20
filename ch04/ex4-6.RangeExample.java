// 코드 4-6 range() 함수를 이용한 반복문 대체(create/RangeExample.java - forLoop())

Observable<Integer> source = Observable.range(1, 10)
  .filter(number -> number % 2 == 0);
source.subscribe(Log::i);
