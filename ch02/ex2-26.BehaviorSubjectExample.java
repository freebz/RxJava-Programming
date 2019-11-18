// 코드 2-26 BehaviorSubject 클래스 활용 예(subjects/BehaviorSubjectExample.java - marbleDiagram())

BehaviorSubject<String> subject = BehaviorSubject.createDefault("6");
subject.subscribe(data -> System.out.println("Subscriber #1 => " + data));
subject.onNext("1");
subject.onNext("3");
subject.subscribe(data -> System.out.println("Subscriber #2 => " + data));
subject.onNext("5");
subject.onComplete();
