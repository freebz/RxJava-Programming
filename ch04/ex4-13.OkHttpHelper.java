// 코드 4-13 OkHttpHelper 클래스의 get() 메서드(common/OkHttpHelper.java - get())

public class OkHttpHelper {
    private static OkHttpClient client = new OkHttpClient();

    public static String get(String url) throws IOException {
	Request request = new Request.Builder()
	  .url(url)
	  .build();

	try {
	    Response res = client.newCall(request).execute();
	    return res.body().string();
	} catch (IOException e) {
	    Log.e(e.getMessage());
	    throw e;
	}
    }
}
