// 코드 5-4 뉴 스레드 스케줄러의 활용 예(schedulers/NewThreadSchedulerExample.java - basic())

String[] orgs = {"1", "3", "5"};
Observable.fromArray(orgs)
  .doOnNext(data -> Log.v("Original data : " + data))
  .map(data -> "<<" + data + ">>")
  .subscribeOn(Schedulers.newThread())
  .subscribe(Log::i);
CommonUtils.sleep(500);

Observable.fromArray(orgs)
  .doOnNext(data -> Log.v("Original data : " + data))
  .map(data -> "##" + data + "##")
  .subscribeOn(Schedulers.newThread())
  .subscribe(Log::i);
CommonUtils.sleep(500);
