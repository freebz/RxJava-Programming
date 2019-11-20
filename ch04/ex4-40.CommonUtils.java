// 코드 4-40 sleepRandom() 함수(common/CommonUtils.java - doSomething())

public static void doSomething() {
    try {
	Thread.sleep(new Random().nextInt(100));
    } catch (InterruptedException e) {
	e.printStackTrace();
    }
}
