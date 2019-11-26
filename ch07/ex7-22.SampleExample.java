// 코드 7-22 emitLast 인자 삽입(flowcontrol/SampleExample.java - emitLast())

// 2개의 Observable을 결합하고 300ms으로 샘플링(emitLast = true).
Observable<String> source = Observable.concat(earlySource, lateSource)
  .sample(300L, TimeUnit.MILLISECONDS, true);
