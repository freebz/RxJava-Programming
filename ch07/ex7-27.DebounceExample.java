// 코드 7-27 debounce() 함수의 활용 예(flowcontrol/DebounceExample.java - marbleDiagram())

String[] data = {"1", "2", "3", "5"};

Observable<String> source = Observable.concat(
  Observable.timer(100L, TimeUnit.MILLISECONDS).map(i -> data[0]),
  Observable.timer(300L, TimeUnit.MILLISECONDS).map(i -> data[1]),
  Observable.timer(100L, TimeUnit.MILLISECONDS).map(i -> data[2]),
  Observable.timer(300L, TimeUnit.MILLISECONDS).map(i -> data[3]))
    .debounce(200L, TimeUnit.MILLISECONDS);

source.subscribe(Log::i);
CommonUtils.sleep(1000);
