// 코드 4-3 Log 클래스와 it() 메서드(common/Log.java - it())

class Log {
    public static void it(Object obj) {
	long time = System.currentTimeMillis() - CommonUtils.startTime;
	System.out.println(getThreadName() + " | " + time + " | " + "value = " + obj);
    }
}
