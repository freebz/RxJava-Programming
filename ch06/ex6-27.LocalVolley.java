// 코드 6-27 RequestQueue 생성하기(volley/LocalVolley.java - newRequestQueue())

public class LocalVolley {
    private static RequestQueue sRequestQueue;
    private LocalVolley() { }

    public static void init(Context context) {
	sRequestQeueue = Volley.newRequestQueue(context);
    }

    public static RequestQueue getRequestQueue() {
	if (sRequestQueue != null) {
	    return sRequestQueue;
	} else {
	    throw new IllegalStateException("Not inited");
	}
    }
}
