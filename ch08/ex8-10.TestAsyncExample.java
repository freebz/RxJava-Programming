// 코드 8-10 GitHub API를 활용한 HTTP 통신 예(TestAsyncExample.java - testHttp())

final String url = "https:://api.github.com/users/yudong80";
Observable<String> source = Observable.just(url)
  .subscribeOn(Schedulers.io())
  .map(OkHttpHelper::get)
  .doOnNext(Log::d)
  .map(json -> GsonHelper.parseValue(json,"name"))
  .observeOn(Schedulers.newThread());

String expected = "Dong Hwan Yu";
source.doOnNext(Log::i)
  .test()
  .awaitDone(3, TimeUnit.SECONDS)
  .assertResult(expected);
