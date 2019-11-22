// 코드 6-29 RequestObject 생성, RequestQueue에 추가, 콜백 등록하기(fragments/VolleyFragment.java - getFuture())

// 2. RequestObject 생성, RequestQueue에 추가, 콜백 등록
private RequestFuture<JSONObject> getFuture() {
    RequestFuture<JSONObject> future = RequestFuture.newFuture();
    JsonObjectRequest req = new JsonObjectRequest(URL, null, future, future);
    LocalVolley.getRequestQueue().add(req);
    return future;
}

private JSONObject getData() throws ExecutionException, InterruptedException {
    return getFuture().get();
}
