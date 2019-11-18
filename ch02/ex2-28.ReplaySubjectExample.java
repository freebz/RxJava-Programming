// 코드 2-28 ReplaySubject 클래스 활용 예(subjects/RepalySubjectExample.java - marbleDiagram())

ReplaySubject<String> subject = ReplaySubject.create();
subject.subscribe(data -> System.out.println("Subscriber #1 => " + data));
subject.onNext("1");
subject.onNext("3");
subject.subscribe(data -> System.out.println("Subscriber #2 => " + data));
subject.onNext("5");
subject.onComplete();
