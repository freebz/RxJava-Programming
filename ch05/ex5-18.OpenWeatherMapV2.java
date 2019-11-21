// 코드 5-18 REST API를 한 번만 호출하도록 개선(examples/OpenWeatherMapV2.java - run())

// ConnectableObservable 클래스를 사용하도록 변경
public void run() {
    CommonUtils.exampleStart();

    Observable<String> source = Observable.just(URL + API_KEY)
      .map(OkHttpHelper::getWithLog)
      .subscribeOn(Schedulers.io())
      .share()
      .observeOn(Schedulers.newThread());

    source.map(this::parseTemperature).subscribe(Log::it);
    source.map(this::parseCityName).subscribe(Log::it);
    source.map(this::parseCountry).subscribe(Log::it);

    CommonUtils.sleep(1000);
}
