// 코드 5-6 파일 입출력 IO 스케줄러(schedulers/IOSchedulerExample.java - basic())

// C 드라이브 루트 디렉터리에 파일 목록 생성.
String root = "c:\\";
File[] files = new File(root).listFiles();
Observable<String> source = Observable.fromArray(files)
  .filter(f -> !f.isDirectory())
  .map(f -> f.getAbsolutePath())
  .subscribeOn(Schedulers.io());

source.subscribe(Log::i);
CommonUtils.sleep(500);
