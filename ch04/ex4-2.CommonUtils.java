// 코드 4-2 CommonUtils 클래스(common/CommonUtils.java - exampleStart() & sleep())

public class CommonUtils {
    // 실행 시간을 표기하기 위한 정적 변수.
    public static long startTime;

    public static void exampleStart() {
	startTime = System.currentTimeMillis();
    }

    public static void sleep(int millis) {
	try {
	    Thread.sleep(millis);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }

// 이후 생략
