// 코드 5-5 계산 스케줄러의 활용 예(schedulers/ComputationSchedulerExample.java - basic())

String[] orgs = {"1", "3", "5"};
Observable<String> source = Observable.fromArray(orgs)
  .zipWith(Observable.interval(100L, TimeUnit.MILLISECONDS), (a, b) -> a);

// 구독(Subscription) #1
source.map(item -> "<<" + item + ">>")
  .subscribeOn(Schedulers.computation())
  .subscribe(Log::i);

// 구독 #2
source.map(item -> "##" + item + "##")
  .subscribeOn(Schedulers.computation())
  .subscribe(Log::i);
CommonUtils.sleep(1000);
