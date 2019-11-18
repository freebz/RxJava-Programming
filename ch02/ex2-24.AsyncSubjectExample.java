// 코드 2-24 구독자로 동작하는 AsyncSubject 클래스(subjects/AsyncSubjectExample.java - asSubscriber())

Float[] temperature = {10.1f, 134f, 12.5f};
Observable<Float> source = Observable.fromArray(temperature);

AsyncSubject<Float> subject = AsyncSubject.create();
subject.subscribe(data -> System.out.println("Subscriber #1 => " + data));

source.subscribe(subject);
