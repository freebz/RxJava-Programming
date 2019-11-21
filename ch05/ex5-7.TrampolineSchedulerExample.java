// 코드 5-7 트램펄린 스케줄러 활용 예(schedulers/TrampolineSchedulerExample.java - basic())

String[] orgs = {"1", "3", "5"};
Observable<String> source = Observable.fromArray(orgs);

// 구독 #1
source.subscribeOn(Schedulers.trampoline())
  .map(data -> "<<" + data + ">>")
  .subscribe(Log::i);

source.subscribeOn(Schedulers.trampoline())
  .map(data -> "##" + data + "##")
  .subscribe(Log::i);
CommonUtils.sleep(500);
