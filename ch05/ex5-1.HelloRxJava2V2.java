// 코드 5-1 함수 인자를 Log::i로 변경(HelloRxJava2V2.java - emit())

Observable.just("Hello", "RxJava 2!!")
  .subscribe(Log::i);
