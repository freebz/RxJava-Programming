// 코드 4-11 repeat() 함수 활용 예(create/RepeatExample.java - marbleDiagram())

String[] balls = {"1", "3", "5"};
Observable<String> source = Observable.fromArray(balls)
  .repeat(3);  // 3번 반복 실행합니다.

// onComplete() 함수를 호출햇을 때 로그 출력.
source.doOnComplete(() -> Log.d("onComplete"))
  .subscribe(Log::i);
