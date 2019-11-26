// 코드 7-24 buffer() 함수의 활용 예 2(flowcontrol/BufferExample.java - bufferSkip())

// 2는 모으고 1개는 건너뜀.
Observable<List<String>> source =
  Observable.concat(earlySource, middleSource, lateSource)
    .buffer(2,3);
