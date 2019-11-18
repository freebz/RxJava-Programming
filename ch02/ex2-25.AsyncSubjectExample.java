// 코드 2-25 onComplete() 함수를 호출한 후 구독(subjects/AsyncSubjectExample.java - afterComplete())

AsyncSubject<Integer> subject = AsyncSubject.create();
subject.onNext(10);
subject.onNext(11);
subject.subscribe(data -> System.out.println("Subscriber #1 => " + data));
subject.onNext(12);
subject.onComplete();
subject.onNext(13);
subject.subscribe(data -> System.out.println("Subscriber #2 => " + data));
subject.subscribe(data -> System.out.println("Subscriber #3 => " + data));
