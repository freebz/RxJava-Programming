// 코드 6-28 LocalVolley 초기화하기(RxAndroid.java - onCreate())

public class RxAndroid extends Application {
    @Override
    public void onCreate() {
	super.onCreate();

	LocalVolley.init(getApplicationContext());
    }
}
