// 코드 4-28 zipWith() 함수의 활용 예(combine/ZipExample.java - zipWithNumbers())

Observalbe<Integer> source = Observalbe.zip(
  Observalbe.just(100, 200, 300),
  Observalbe.just(10, 20, 30),
  (a, b) -> a + b)
    .zipWith(Observable.just(1, 2, 3), (ab, c) -> ab + c);
source.subscribe(Log::i);
