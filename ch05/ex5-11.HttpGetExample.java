// 코드 5-11 URL 호출(examples/HttpGetExample.java - run())

Request request = new Request.Builder()
  .url(URL_README)
  .build();
client.newCall(request).enqueue(new Callback() {
    @Override
    public void onFailure(Call call, IOException e) {
      e.printStackTrace();
    }

    @Override
    public void onResponse(Call call, Response response) throws IOException {
      Log.i(response.body().string());
    }
});
