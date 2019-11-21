// 코드 5-9 Executor를 활용한 스케줄러 지정(schedulers/ExecutorSchedulerExample.java - basic())

final int THREAD_NUM = 10;

String[] data = {"1", "3", "5"};
Observable<String> source = Observable.fromArray(data);
Executor executor = Executors.newFixedThreadPool(THREAD_NUM);

source.subscribeOn(Schedulers.from(executor))
  .subscribe(Log::i);
source.subscribeOn(Schedulers.from(executor))
  .subscribe(Log::i);
CommonUtils.sleep(500);
