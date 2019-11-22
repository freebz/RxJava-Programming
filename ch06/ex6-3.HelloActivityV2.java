// 코드 6-3 람다 표현식으로 변형한 Hello world(activities/HelloActivityV2.java - create())

Observable.<String>create(s -> {
    s.onNext("Hello, world!");
    s.onComplete();
}).subscribe(o -> textView.setText(o));
