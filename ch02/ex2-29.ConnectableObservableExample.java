// 코드 2-29 ConnectableObservable 클래스 활용 예(ConnectableObservableExample.java - marbleDiagram())

String[] dt = {"1", "3", "5"};
Observable<String> balls = Observable.interval(100L, TimeUnit.MILISECONDS)
  .map(Long::intValue)
  .map(i -> dt[i])
  .take(dt.length);
ConnectableObservable<String> source = balls.publish();
source.subscribe(data -> System.out.println("Subscriber #1 => " + data));
source.subscribe(data -> System.out.println("Subscriber #2 => " + data));
source.connect();

CommonUtils.sleep(250);
source.subscribe(data -> System.out.println("Subscriber #3 => " + data));
