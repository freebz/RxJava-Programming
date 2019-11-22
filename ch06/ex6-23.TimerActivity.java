// 코드 6-23 CountDownTimer 클래스의 활용 예(activities/TimerActivity.java - initCountDownTask())

private static final int MILLISINFUTURE = 11 * 1000;
private static final int COUNT_DOWN_INTERVAL = 1000;

CountDownTimer mCountDownTimer;

private void initCountDownTask() {
    mCountDownTimer = new CountDownTimer(MILLISINFUTURE, COUNT_DOWN_INTERVAL) {
	@Override
	public void onTick(long l) {
	    mTextView.setText(String.valueOf(count--));
	}

	@Override
	public void ofFinish() {
	    mTextView.setText("Finish.");
	}
    };
}
