// 코드 7-10 ON_ERROR_MISSING의 RxJava 내부 코드

/**
 * Throwable을 받아서 OnErrorNOtImplementedException으로 만들고 플러그인의 에러 처리자에게
 * 알립니다.
 */
public static final Consumer<Throwable> ON_ERROR_MISSING = new Consumer<Throwable>() {
    @Override
    public void accept(Throwable error) {
	RxJavaPlugins.onError(new OnErrorNotImplementedException(error));
    }
};
