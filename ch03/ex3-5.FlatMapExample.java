// 코드 3-5 flatMap() 함수의 인라인 람다 표현식(FlatMapExample.java - flatMapLambda())

Observable<String> source = Observable.fromArray(balls)
  .flatMap(ball -> Observable.just(ball + "⋄", ball + "⋄"));
