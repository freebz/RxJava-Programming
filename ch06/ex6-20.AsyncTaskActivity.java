// 코드 6-20 AsyncTask 클래스의 활용 예(activities/AsyncTaskActivity.java - MyAsyncTask)

private void initAndroidAsync() {
    myAsyncTask = new MyAsyncTask();
    myasynctask.execute("Hello", "async", "world");
}

public class MyAsyncTask extends AsyncTask<String, Void, String> {
    @Override
    protected String doInBackground(String... params) {
	StringBuilder word = new StringBuilder();
	for (String s : params) {
	    word.append(s).append(" ");
	}
	return word.toSTring();
    }

    @Override
    protected void onPostExecute(String result) {
	super.onPostExecute(result);
	mAndroidTextView.setText(result);
    }
}
