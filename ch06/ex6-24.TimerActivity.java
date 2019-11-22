// 코드 6-24 Handler 클래스의 활용 예(activities/TimerActivity.java - run())

private Handler mHandler;
private Runnable timer = new Runnable() {
    public void run() {
	// 반복 실행할 코드를 작성합니다.
	mTextView.setText(String.valueOf(count++));
	mHandler.postDelayed(this, 1000);
    }
};

private void initHandler() {
    mHandler = new Handler();
}

public void handerStart() {
    mHandler.postDelayed(timer, 0);
}
