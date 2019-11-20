// 코드 4-24 숫자 계산(combine/ZipExample.java - zipNumbers())

Observable<Integer> source = Observable.zip(
  Observable.just(100, 200, 300),
  Observable.just(10, 20, 30),
  Observable.just(1, 2, 3),
  (a, b, c) -> a + b + c );
source.subscribe(Log::i);
