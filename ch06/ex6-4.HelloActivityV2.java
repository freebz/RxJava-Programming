// 코드 6-4 just() 함수 사용(activities/HelloActivityV2.java - just())

Observable.just("Hello, world!")
  .subscribe(textView::setText);
