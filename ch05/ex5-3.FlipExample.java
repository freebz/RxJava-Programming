// 코드 5-3 observeOn() 함수 호출 부분 제거(FlipExample.java - observedOnRemoved())

String[] objs = {"1-S", "2-T", "3-P"};
Observable<String> source = Observable.fromArray(objs)
  .doOnNext(data -> Log.v("Original data = " + data))
  .usbscribeOn(Schedulers.newThread())
  // .observeOn(Schedulers.newThread())
  .map(Shape::flip);
source.subscribe(Log::i);
CommonUtils.sleep(500);
