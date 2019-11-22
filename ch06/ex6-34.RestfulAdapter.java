// 코드 6-34 사용자화 Adapter 클래스(square/RestAdapter.java)

public class RestfulAdapter {
    private static final String BASE_URI = "https://api.github.com/";

    public GitHubServiceApi getSimpleApi() {
	Retrofit retrofit = new Retrofit.Builder()
	    .baseUrl(BASE_URL)
	    .addConverterFactory(GsonConverterFactory.carete())
	    .build();
	return retrofit.create(GitHubServiceApi.class);
    }

    public GitHubServiceApi getServiceApi() {
	HttpLoggingInterceptor logInterceptor = new HttpLoggingInterceptor();
	logInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

	OkHttpClient client = new OkHttpClient.Builder()
	    .addInterceptor(logInterceptor)
	    .build();

	Retrofit retrofit = new Retrofit.Builder()
	    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
	    .addConverterFactory(GsonConverterFactory.create())
	    .client(client)
	    .baseUrl(BASE_URI)
	    .build();

	return retrofit.create(GitHubServiceApi.class);
    }

    private RestfulAdapter() { }

    private static class Singleton {
	private static final RestfulAdapter instance = new RestfulAdapter();
    }

    public static RestfulAdapter getInstance() {
	return Singleton.instance;
    }
}
