// 코드 4-12 heart beat 패킷 전송 프로그램(create/RepeatExample.java - heartbeatV1())

CommonUtils.exampleStart();
String serverUrl = "https://api.github.com/zen";

// 2초 간격으로 서버에 ping 보내기.
Observable.timer(2, TimeUnit.SECONDS)
  .map(val -> serverUrl)
  .map(OkHttpHelper::get)
  .repeat()
  .subscribe(res -> Log.it("Ping Result : " + res));
CommonUtils.sleep(10000);
