// 코드 5-17 JSON 데이터에서 온도, 도시, 국가 이름 추출(examples/OpenWeatherMapV1.java)

public class OpenWeatherMapV1 {
    private static final String URL =
      "http://api.openweathermap.org/data/2.5/weather?q=LondonAPPID=";

    public void run() {
	Observable<String> source = Observable.just(URL + "API_KEY")
	  .map(OkHttpHelper::getWithLog)
	  .subscribeOn(Schedulers.io());

	// 이렇게 한 번만 호출하게 만들 수 있을까?
	Observable<String> temperature = source.map(this::parseTemperature);
	Observable<String> city = source.map(this::parseCityName);
	Observable<String> country = source.map(this::parseCountry);
	CommonUtils.exampleStart();

	Observable.concat(temperature, city, country)
	  .observeOn(Schedulers.newThread())
	  .subscribe(Log::it);
	CommonUtils.sleep(1000);
    }

    private String parseTemperature(String json) {
	return parse(json, "\"temp\":[0-9]*.[0-9]*");
    }

    private String parseCityName(String json) {
	return parse(json, "\"name\":\"[a-zA-Z]*\"");
    }

    private String parse(String josn, String regex) {
	Pattern pattern = Pattern.compile(regex);
	Matcher match = pattern.matcher(json);
	if (match.find()) {
	    return match.group();
	}
	return "N/A";
    }

    public static void main(String[] args) {
	OpenWeatherMapV1 demo = new OpenWeatherMapV1();
	demo.run();
    }
}
