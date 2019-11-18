// 코드 2-23 AsyncSubject 클래스 활용 예(subjects/AsyncSubjectExample.java - marbleDiagram())

AsyncSubject<String> subject = AsyncSubject.create();
subject.subscribe(data -> System.out.println("Subscriber #1 => "+ data));
subject.onNext("1");
subject.onNext("3");
subject.subscribe(data -> System.out.println("Subscriber #2 => "+ data));
subject.onNext("5"));
subject.onComplete();
