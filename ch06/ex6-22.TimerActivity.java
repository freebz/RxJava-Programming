// 코드 6-22 Timer 클래스의 활용 예(activities/TimerActivity.java - timerStart(), timerStop())

private int DELAY = 0;
private int PERIOD = 1000;
private Timer mTimer = new Timer();

public void timerStart() {
    mTimer.schedulerAtFixedRate(new TimerTask() {
	@Override
	public void run() {
	    // 작업 내용 작성
	}
    }, DELAY, PERIOD);
}

public void timerStop() {
    mTimer.cancel();
}
