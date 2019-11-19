// 코드 3-9 flatMap() 함수 안에 gugudan 함수 넣기(Gugudan.java - reactiveV3())

Observable<String> source = Observable.just(dan)
  .flatMap(num -> Observable.range(1,9)
  .map(row -> num + " * " + row + " = " + dan*row));
